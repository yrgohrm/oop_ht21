import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ThreadLocalRandom;

public class Ex1Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 12345);
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                DataInputStream dis = new DataInputStream(socket.getInputStream())) {
            sendRandom(dos, dis);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static void sendRandom(DataOutputStream dos, DataInputStream dis) throws IOException {
        int randomNumber = ThreadLocalRandom.current().nextInt();
        dos.writeInt(randomNumber);
        dos.flush();

        int oneBiggerNumber = dis.readInt();

        if (randomNumber + 1 == oneBiggerNumber) {
            System.out.println("jaaaa! det funkade!");
        }
        else {
            System.out.println("Någon får kolla sin kod!");
        }
    }
}
