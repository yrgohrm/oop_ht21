import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex1Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(12345)) {
            // the program will wait here until someone connects

            for (int i = 0; i < 3; ++i) {
                try (Socket connectionToClient = server.accept()) {
                    handleClient(connectionToClient);
                }
            }
        }
        catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private static void handleClient(Socket connectionToClient) {
        try (InputStream is = connectionToClient.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                OutputStream os = connectionToClient.getOutputStream();
                DataOutputStream dos = new DataOutputStream(os)) {

            int value = dis.readInt();
            dos.writeInt(value + 1);
            dos.flush();
        }
        catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
