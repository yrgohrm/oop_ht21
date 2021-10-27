import java.io.IOException;

public class Ex5_2 {
    private static void throwChecked() throws IOException {
        throw new IOException("bsbsbsb");
    }

    private static void doStuff() throws IOException {
        throwChecked();
    }

    public static void main(String[] args) {
        try {
            throwChecked();
            doStuff();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
