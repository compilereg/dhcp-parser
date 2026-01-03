package utils;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import edu.aast.cndc.dhcpd.antlr.DhcpdConfLexer;
import edu.aast.cndc.dhcpd.antlr.DhcpdConfParser;
import models.DhcpdModel;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class DhcpdConfigLoader {

  public static DhcpdModel loadWithIncludes(Path mainFile, Path includeFallbackDir) throws IOException {
    Objects.requireNonNull(mainFile, "mainFile");
    Objects.requireNonNull(includeFallbackDir, "includeFallbackDir");

    DhcpdModel model = new DhcpdModel();
    Set<Path> visited = new HashSet<>();

    parseFileRecursive(mainFile.normalize().toAbsolutePath(), includeFallbackDir, visited, model);
    return model;
  }

  private static void parseFileRecursive(
      Path file,
      Path includeFallbackDir,
      Set<Path> visited,
      DhcpdModel model
  ) throws IOException {

    if (!Files.exists(file)) {
      // Try basename fallback (your case: includes are /acpc/adm/etc/dhcp/..., but files are in /mnt/data/)
      Path fallback = includeFallbackDir.resolve(file.getFileName().toString());
      if (Files.exists(fallback)) file = fallback.toAbsolutePath().normalize();
    }

    if (!Files.exists(file)) {
      // Be strict or permissive based on your needs:
      // Strict: throw; Permissive: warn and return.
      System.err.println("WARN: include file not found: " + file);
      return;
    }

    if (!visited.add(file)) {
      // already parsed (prevents include cycles)
      return;
    }

    String text = Files.readString(file, StandardCharsets.UTF_8);

    ParseTree tree = parse(text);

    // 1) first collect includes in-order (so parse order matches dhcpd.conf include order)
    IncludeCollector includes = new IncludeCollector();
    includes.visit(tree);

    // 2) extract semantic data from this file
    ModelVisitor visitor = new ModelVisitor(model);
    visitor.visit(tree);

    // 3) recursively parse includes
    for (String includePathRaw : includes.getIncludes()) {
      Path includePath = resolveIncludePath(file, includePathRaw);
      parseFileRecursive(includePath, includeFallbackDir, visited, model);
    }
  }

  private static Path resolveIncludePath(Path includingFile, String includePathRaw) {
    // includePathRaw is typically absolute in your config: "/acpc/adm/etc/dhcp/dhcpd.conf.options" :contentReference[oaicite:2]{index=2}
    Path p = Paths.get(includePathRaw);
    if (p.isAbsolute()) return p.normalize();

    // Relative include: resolve relative to the including file directory
    Path baseDir = includingFile.getParent() == null ? Paths.get(".") : includingFile.getParent();
    return baseDir.resolve(p).normalize();
  }

  private static ParseTree parse(String text) {
    CharStream input = CharStreams.fromString(text);
    DhcpdConfLexer lexer = new DhcpdConfLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    DhcpdConfParser parser = new DhcpdConfParser(tokens);

    // Fail-fast error strategy is often better for config parsing
    parser.removeErrorListeners();
    parser.addErrorListener(new BaseErrorListener() {
      @Override
      public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                              int line, int charPositionInLine, String msg, RecognitionException e) {
        throw new RuntimeException("Parse error at " + line + ":" + charPositionInLine + " - " + msg, e);
      }
    });

    return parser.config();
  }
}
