package figure1_isp;

public interface CloudStorageProvider {
    void storeFile(String fileName);
    String getFile(String fileName);
}
