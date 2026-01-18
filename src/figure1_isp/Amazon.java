package figure1_isp;

import java.util.ArrayList;
import java.util.List;

public class Amazon implements CloudHostingProvider, CDNProvider {
    private List<String> servers = new ArrayList<>();

    public void hostVirtualServer(String serverName) {
        servers.add(serverName);
    }

    public void listVirtualServers() {
        for (String server : servers) {
            System.out.println(server);
        }
    }

    public String getCDNAddress() {
        return "cdn.amazon.com";
    }
}
