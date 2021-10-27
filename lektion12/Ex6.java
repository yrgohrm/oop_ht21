import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex6 {
    private static void readFile(String name) throws IOException {
        InputStream is = new FileInputStream(name);
        is.read();
    }

    private static void doStuff() throws IOException {
        readFile("somefile.txt");
    }

    public static void main(String[] args) throws IOException {
        if (Math.random() > 0.5) {
            doStuff();
        }
        else {
            readFile("nofile.txt");
        }
    }
}
