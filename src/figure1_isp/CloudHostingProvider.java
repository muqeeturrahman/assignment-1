package figure1_isp;

public interface CloudHostingProvider {
    void hostVirtualServer(String serverName);
    void listVirtualServers();
}
