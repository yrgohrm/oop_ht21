import java.io.BufferedWriter;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class App {
    public static void main(String[] args) {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("test.txt"), StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            writer.write("Hejsan!");
        }
        catch (IOException ex) {
            System.err.println("Det gick snett med filen test.txt:" + ex.getMessage());
            ex.printStackTrace();
        }
    }
}