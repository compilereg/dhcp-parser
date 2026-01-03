package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import models.DhcpdModel;
import models.TsigKey;

public final class DhcpdJsonWriter {
  private DhcpdJsonWriter() {}

  public static String toJson(DhcpdModel model, boolean pretty, boolean maskSecrets) throws Exception {
    DhcpdModel safe = maskSecrets ? maskSecrets(model) : model;

    ObjectMapper mapper = new ObjectMapper();
    if (pretty) mapper.enable(SerializationFeature.INDENT_OUTPUT);

    return mapper.writeValueAsString(safe);
  }

  private static DhcpdModel maskSecrets(DhcpdModel model) {
    DhcpdModel copy = new DhcpdModel();

    copy.globalOptions.putAll(model.globalOptions);
    copy.subnets.addAll(model.subnets);
    copy.hosts.addAll(model.hosts);

    // Deep-copy keys so we can mask
    for (TsigKey k : model.keys) {
      TsigKey nk = new TsigKey();
      nk.name = k.name;
      nk.algorithm = k.algorithm;
      nk.secret = (k.secret == null || k.secret.isBlank()) ? null : "***MASKED***";
      copy.keys.add(nk);
    }

    return copy;
  }
}
