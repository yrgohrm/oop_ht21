import java.io.File;

public interface FileStorage {
    File open();
    void save(File file);
}
