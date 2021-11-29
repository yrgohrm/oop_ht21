import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        URI wiki = URI.create("https://www.wikipedia.org");
        HttpRequest request = HttpRequest.newBuilder().uri(wiki).build();

        HttpResponse<String> resp = client.send(request, BodyHandlers.ofString());

        // We find the actual web page in the body
        System.out.println(resp.body());
    }
}
