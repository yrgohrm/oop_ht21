import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercises {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("hello.txt", true)))) {
            writer.println("Hello world!");
        }
        catch (IOException ex) {
            System.err.println("Någonting gick snett.");
            ex.printStackTrace();
        }
    }
}
