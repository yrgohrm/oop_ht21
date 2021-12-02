import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        try (Socket socket = new Socket("localhost", 12345);
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os))) {

            for (int i = 0; i < 3; ++i) {
                writer.write("Ping\n");
                writer.flush();
                String answer = reader.readLine();
                System.out.println("Response: " + answer);
            }
        }
    }
}
