package models;

import java.util.*;

public class DhcpdModel {
  public Map<String, String> globalOptions = new LinkedHashMap<>();
  public List<Subnet> subnets = new ArrayList<>();
  public List<HostReservation> hosts = new ArrayList<>();
  public List<TsigKey> keys = new ArrayList<>();
}

