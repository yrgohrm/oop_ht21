import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        // the domain name looks strange since it contains an ä
        URI showerUri = URI.create("https://laromedel.nu/showerthought/?type=text&id=22");
        HttpRequest request = HttpRequest.newBuilder().uri(showerUri).build();

        HttpResponse<String> resp = client.send(request, BodyHandlers.ofString());

        System.out.println(resp.body());

    }
}
