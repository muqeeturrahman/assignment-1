package figure1_isp;

import java.util.HashMap;
import java.util.Map;

public class Dropbox implements CloudStorageProvider {
    private Map<String, String> files = new HashMap<>();

    public void storeFile(String fileName) {
        files.put(fileName, "data");
    }

    public String getFile(String fileName) {
        return files.get(fileName);
    }
}
