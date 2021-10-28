import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExRead {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("hello.txt"))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }

                System.out.println(line);
            }
        }

        try (FileReader reader = new FileReader("hello.txt")) {
            while (true) {
                int n = reader.read();
                if (n == -1) {
                    break;
                }

                System.out.print(n);
                System.out.print(" ");
            }
        }
        
    }
}
