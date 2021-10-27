import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex7 {
    private static void readFile(String name) {
        try {
            InputStream is = new FileInputStream(name);
            is.read();
        }
        catch (IOException ex) {
            throw new IllegalArgumentException("wrong name: " 
                                               + name, ex);
        }
    }

    public static void main(String[] args) {
        readFile("nofile.txt");
    }
}
