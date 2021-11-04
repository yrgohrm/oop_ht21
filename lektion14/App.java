import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class App {
    public static void main(String[] args) {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("hej.txt"), StandardOpenOption.APPEND)) {
            writer.write("Hejsan världen!");
            writer.newLine();
        }
        catch (IOException ex) {
            System.out.println("Det gick snett: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}