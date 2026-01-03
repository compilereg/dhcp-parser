package utils;

import java.util.*;

import models.DhcpdModel;

public class ModelVisitor extends DhcpdConfBaseVisitor<Void> {

  private final DhcpdModel model;

  // stack to know “where we are”
  private final Deque<Object> context = new ArrayDeque<>();

  public ModelVisitor(DhcpdModel model) {
    this.model = Objects.requireNonNull(model);
  }

  @Override
  public Void visitSimpleStmt(DhcpdConfParser.SimpleStmtContext ctx) {
    String head = ctx.stmtHead().getText();
    String body = ctx.stmtBody() == null ? "" : joinStmtBody(ctx.stmtBody());

    // Global options (very common)
    if ("option".equals(head)) {
      // example: option domain-name "acpc.local";
      // store "domain-name" -> "\"acpc.local\"" (or unquote later)
      String[] parts = splitFirstToken(body);
      if (parts[0] != null && parts[1] != null) {
        setOption(parts[0], parts[1]);
      }
      return null;
    }

    // In host blocks you often have: fixed-address X; hardware ethernet MAC; ddns-hostname "name";
    if (peekHost() != null) {
      HostReservation h = peekHost();
      switch (head) {
        case "fixed-address" -> h.fixedAddress = firstToken(body);
        case "hardware" -> {
          // usually: hardware ethernet 00:11:22:33:44:55;
          if (body.startsWith("ethernet")) {
            h.mac = firstToken(body.substring("ethernet".length()).trim());
          }
        }
        case "ddns-hostname" -> h.ddnsHostname = unquoteIfQuoted(firstToken(body));
        default -> {
          // Allow host-scoped options too
          if ("option".equals(head)) {
            String[] parts = splitFirstToken(body);
            if (parts[0] != null && parts[1] != null) {
              h.options.put(parts[0], parts[1]);
            }
          }
        }
      }
      return null;
    }

    // In subnet blocks you often have: range A B; option routers X; next-server X;
    if (peekSubnet() != null) {
      Subnet s = peekSubnet();
      switch (head) {
        case "range" -> {
          String[] tokens = body.split("\\s+");
          if (tokens.length >= 2) { s.rangeStart = tokens[0]; s.rangeEnd = tokens[1]; }
        }
        case "next-server" -> s.nextServer = firstToken(body);
        default -> {
          if ("option".equals(head)) {
            String[] parts = splitFirstToken(body);
            if (parts[0] != null && parts[1] != null) {
              s.options.put(parts[0], parts[1]);
              if ("routers".equals(parts[0])) s.router = firstToken(parts[1]);
            }
          }
        }
      }
      return null;
    }

    // TSIG key contents
    if (peekKey() != null) {
      TsigKey k = peekKey();
      switch (head) {
        case "algorithm" -> k.algorithm = firstToken(body);
        case "secret" -> k.secret = unquoteIfQuoted(firstToken(body));
      }
      return null;
    }

    return null;
  }

  @Override
  public Void visitBlock(DhcpdConfParser.BlockContext ctx) {
    String head = ctx.blockHead().getText();

    if ("subnet".equals(head)) {
      Subnet subnet = new Subnet();
      // block params usually: <network> netmask <mask>
      if (ctx.blockParams() != null) {
        List<String> items = flattenParams(ctx.blockParams());
        subnet.network = firstIp(items);
        subnet.netmask = valueAfter(items, "netmask");
      }
      model.subnets.add(subnet);
      context.push(subnet);
      super.visitBlock(ctx);
      context.pop();
      return null;
    }

    if ("host".equals(head)) {
      HostReservation host = new HostReservation();
      if (ctx.blockParams() != null) {
        List<String> items = flattenParams(ctx.blockParams());
        // typical: host <name> { ... }
        host.name = firstIdentifier(items);
      }
      model.hosts.add(host);
      context.push(host);
      super.visitBlock(ctx);
      context.pop();
      return null;
    }

    if ("key".equals(head)) {
      TsigKey key = new TsigKey();
      if (ctx.blockParams() != null) {
        List<String> items = flattenParams(ctx.blockParams());
        key.name = firstIdentifier(items);
      }
      model.keys.add(key);
      context.push(key);
      super.visitBlock(ctx);
      context.pop();
      return null;
    }

    return super.visitBlock(ctx);
  }

  /* helpers */

  private void setOption(String name, String value) {
    // global options only (keep last-write-wins)
    model.globalOptions.put(name, value);
  }

  private HostReservation peekHost() {
    for (Object o : context) if (o instanceof HostReservation) return (HostReservation) o;
    return null;
  }

  private Subnet peekSubnet() {
    for (Object o : context) if (o instanceof Subnet) return (Subnet) o;
    return null;
  }

  private TsigKey peekKey() {
    for (Object o : context) if (o instanceof TsigKey) return (TsigKey) o;
    return null;
  }

  private static String joinStmtBody(DhcpdConfParser.StmtBodyContext bodyCtx) {
    StringBuilder sb = new StringBuilder();
    for (DhcpdConfParser.StmtItemContext it : bodyCtx.stmtItem()) {
      if (sb.length() > 0) sb.append(' ');
      sb.append(it.getText());
    }
    return sb.toString().trim();
  }

  private static String firstToken(String s) {
    if (s == null) return null;
    String t = s.trim();
    if (t.isEmpty()) return null;
    int sp = t.indexOf(' ');
    return sp < 0 ? t : t.substring(0, sp);
  }

  private static String[] splitFirstToken(String s) {
    if (s == null) return new String[]{null, null};
    String t = s.trim();
    if (t.isEmpty()) return new String[]{null, null};
    int sp = t.indexOf(' ');
    if (sp < 0) return new String[]{t, ""};
    return new String[]{t.substring(0, sp), t.substring(sp + 1).trim()};
  }

  private static String unquoteIfQuoted(String s) {
    if (s == null) return null;
    if (s.length() >= 2 && s.startsWith("\"") && s.endsWith("\"")) return s.substring(1, s.length() - 1);
    return s;
  }

  private static List<String> flattenParams(DhcpdConfParser.BlockParamsContext params) {
    List<String> out = new ArrayList<>();
    for (DhcpdConfParser.StmtItemContext it : params.stmtItem()) out.add(it.getText());
    return out;
  }

  private static String firstIp(List<String> items) {
    for (String x : items) if (x.matches("\\d+\\.\\d+\\.\\d+\\.\\d+")) return x;
    return null;
  }

  private static String firstIdentifier(List<String> items) {
    for (String x : items) {
      if (x.matches("[a-zA-Z_][a-zA-Z0-9_\\-\\.]*") && !isKeyword(x)) return x;
    }
    return null;
  }

  private static boolean isKeyword(String x) {
    return Set.of("netmask").contains(x);
  }

  private static String valueAfter(List<String> items, String key) {
    for (int i = 0; i + 1 < items.size(); i++) {
      if (key.equals(items.get(i))) return items.get(i + 1);
    }
    return null;
  }
}
