package models;

import java.util.*;

public class Subnet {
  public String network;
  public String netmask;

  public String rangeStart;
  public String rangeEnd;

  public String router;
  public String nextServer;

  public Map<String, String> options = new LinkedHashMap<>();
}
