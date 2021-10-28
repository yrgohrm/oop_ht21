import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            System.out.println(n);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line; 
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}