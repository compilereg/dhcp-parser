package dhcpd;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import models.DhcpdModel;
import utils.DhcpdConfigLoader;
import utils.DhcpdJsonWriter;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting..");
		 Path main = Path.of("dhcp-conf/dhcpd.conf");
		    Path fallbackDir = Path.of("/mnt/data"); // contains dhcpd.conf.options, dhcpd.conf.subnet, dhcpd.conf.hosts, dhcpupdate.conf

		    DhcpdModel model = DhcpdConfigLoader.loadWithIncludes(main, fallbackDir);

		    // JSON output
		    boolean pretty = true;
		    boolean maskSecrets = true;

		    String json = DhcpdJsonWriter.toJson(model, pretty, maskSecrets);

		    // Print to stdout
		    System.out.println(json);

		    // Also write to a file (optional)
		    Path out = Path.of("/mnt/data/dhcpd-parsed.json");
		    Files.writeString(out, json, StandardCharsets.UTF_8);
		    


	}

}
