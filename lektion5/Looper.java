import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class Looper {
    public static void main(String[] args) {
        for (int i = 0; i < 3; ++i) {
            System.out.printf("Skämt nummer %d.%n%s%n", i+1, getJoke());
        }

        Scanner scanner = new Scanner(System.in);

        String answer;
        do {
            System.out.println(getJoke());

            System.out.println("Vill du få ett skämt till? (j/n)");
            answer = scanner.nextLine();
        } while (answer.equals("j") || answer.equals("J"));
    }

    private static String getJoke() {
        try {
            final URI dadJokeUri = URI.create("https://icanhazdadjoke.com");

            final HttpClient client = HttpClient.newHttpClient();

            final HttpRequest request = HttpRequest.newBuilder()
                                                   .uri(dadJokeUri)
                                                   .header("Accept", "text/plain")
                                                   .header("User-Agent", "yrgo-oop-course")
                                                   .build();

            HttpResponse<String> resp = client.send(request, BodyHandlers.ofString());
            return resp.body();
        }
        catch (IOException ex) {
            return "";
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            return "";
        }
    }
}
