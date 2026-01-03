package models;

public class TsigKey {
	  public String name;
	  public String algorithm;

	  // WARNING: secret is sensitive. We'll mask it in JSON output by default.
	  public String secret;
	}
