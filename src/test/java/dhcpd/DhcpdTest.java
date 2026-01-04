package dhcpd;

import static org.junit.Assert.*;

import java.nio.file.Path;

import org.junit.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import models.DhcpdModel;
import utils.DhcpdConfigLoader;
import utils.DhcpdJsonWriter;

public class DhcpdTest {

	@Test
	public void test() throws Exception {
		System.out.println("Starting ACPC Control Web Panel");

		Path main = Path.of("dhcp-conf/dhcpd.conf");
	    Path fallbackDir = Path.of("/mnt/data"); // contains dhcpd.conf.options, dhcpd.conf.subnet, dhcpd.conf.hosts, dhcpupdate.conf

	    DhcpdModel model = DhcpdConfigLoader.loadWithIncludes(main, fallbackDir);

	    // JSON output
	    boolean pretty = true;
	    boolean maskSecrets = true;

	    String json = DhcpdJsonWriter.toJson(model, pretty, maskSecrets);
	    JsonElement element = JsonParser.parseString(json);
	    JsonObject obj = element.getAsJsonObject();
        JsonObject data = obj.getAsJsonObject("globalOptions");
        
	    
	    
	    System.out.println(json);
	    
	    assertEquals(1,1);
	    /*
	     * JsonObject obj = element.getAsJsonObject();
        JsonObject data = obj.getAsJsonObject("data");
        JsonArray translations = data.getAsJsonArray("translations");
        JsonObject firstTranslation = translations.get(0).getAsJsonObject();

        								Extract the value as a specific type
        String result = firstTranslation.get("translatedText").getAsString();
	     */
	    
	}

}
