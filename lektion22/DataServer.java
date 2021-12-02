import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ThreadLocalRandom;

public class DataServer {
    public static void main(String[] args) throws IOException {
        // NB! This code is lacking a lot of try-with-resources for clarity
        ServerSocket server = new ServerSocket(12345);

        // the program will wait here until someone connects
        Socket connectionToClient = server.accept();

        InputStream is = connectionToClient.getInputStream();
        DataInputStream dataIn = new DataInputStream(is);

        OutputStream os = connectionToClient.getOutputStream();
        DataOutputStream dataOut = new DataOutputStream(os);

        int random;
        do {
            random = dataIn.readInt();
            System.out.println("Request: " + random);
            dataOut.writeInt(ThreadLocalRandom.current().nextInt(20));
            dataOut.flush();
        } while (random != 0);

        connectionToClient.close();
        server.close();
    }
}
