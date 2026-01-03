package models;

import java.util.*;

public class HostReservation {
  public String name;
  public String mac;
  public String fixedAddress;
  public String ddnsHostname;

  public Map<String, String> options = new LinkedHashMap<>();
}
