import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ThreadLocalRandom;

public class DataClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        try (Socket socket = new Socket("localhost", 12345);
             InputStream is = socket.getInputStream();
             OutputStream os = socket.getOutputStream();
             DataInputStream dataIn = new DataInputStream(is);
             DataOutputStream dataOut = new DataOutputStream(os)) {

            int randomOut;
            do {
                randomOut = ThreadLocalRandom.current().nextInt(20);
                dataOut.writeInt(randomOut);
                dataOut.flush();
                int randomIn = dataIn.readInt();
                System.out.println("Response: " + randomIn);
            } while (randomOut != 0);
        }
    }
}
