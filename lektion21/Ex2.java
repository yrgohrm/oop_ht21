import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Ex2 {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        
        try {
            for (int i = 0; i < 5; ++i) {
                String joke = getJoke(client);
                System.out.println(joke);
            }
        }
        catch (RuntimeException | InterruptedException | IOException ex) {
            Thread.currentThread().interrupt();
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static String getJoke(HttpClient client) throws IOException, InterruptedException {
        URI dadUri = URI.create("https://icanhazdadjoke.com");
        HttpRequest request = HttpRequest.newBuilder().uri(dadUri).header("Accept", "text/plain")
                .header("User-Agent", "Yrgo OOP Class (https://yrgo.se)").build();

        HttpResponse<String> resp = client.send(request, BodyHandlers.ofString());

        if (resp.statusCode() != 200) {
            throw new RuntimeException("Error error!");
        }

        return resp.body();
    }
}
