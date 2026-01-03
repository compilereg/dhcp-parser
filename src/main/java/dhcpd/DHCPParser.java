package dhcpd;

import java.nio.file.Path;

import models.DhcpdModel;
import utils.DhcpdConfigLoader;
import utils.DhcpdJsonWriter;
/*
 * The main starter function, it takes conf file path, and return the configuration string in JSON
 */

public class DHCPParser {
	private String confFile;
	
	public DHCPParser(String confFile) {
		this.confFile = confFile;
	}
	
	public String Start() throws Exception {
		
		Path main = Path.of(this.confFile);
		Path fallbackDir = Path.of(""); // contains dhcpd.conf.options, dhcpd.conf.subnet, dhcpd.conf.hosts, dhcpupdate.conf

	    DhcpdModel model = DhcpdConfigLoader.loadWithIncludes(main, fallbackDir);

	    // JSON output
	    boolean pretty = true;
	    boolean maskSecrets = true;

	    String json = DhcpdJsonWriter.toJson(model, pretty, maskSecrets);
		
		return json;
	}
}
