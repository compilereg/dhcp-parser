package utils;

import java.util.*;

public class IncludeCollector extends DhcpdConfBaseVisitor<Void> {
  private final List<String> includes = new ArrayList<>();

  public List<String> getIncludes() { return includes; }

  @Override
  public Void visitIncludeStmt(DhcpdConfParser.IncludeStmtContext ctx) {
    String raw = ctx.stringLiteral().getText(); // quoted
    includes.add(unquote(raw));
    return null;
  }

  private static String unquote(String s) {
    if (s == null || s.length() < 2) return s;
    if (s.startsWith("\"") && s.endsWith("\"")) return s.substring(1, s.length() - 1);
    return s;
  }
}
