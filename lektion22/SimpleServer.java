import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        // NB! This code is lacking a lot of try-with-resources for clarity
        ServerSocket server = new ServerSocket(12345);

        // the program will wait here until someone connects
        Socket connectionToClient = server.accept();

        System.out.println("accepted");

        InputStream is = connectionToClient.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        OutputStream os = connectionToClient.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));

        //for (int i = 0; i < 3; ++i) {
            System.out.println(reader.readLine());
            writer.write("Pong\n");
            writer.flush();
        //}

        connectionToClient.close();
        server.close();
    }
}