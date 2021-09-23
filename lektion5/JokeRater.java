import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class JokeRater {
    private String highestRatedJoke;
    private int highestRating;
    private String lastJoke;

    public String getJoke() {
        lastJoke = getJokeFromWeb();
        return lastJoke;
    }

    public void rateLastJoke(int rating) {
        if (rating >= highestRating) {
            highestRating = rating;
            highestRatedJoke = lastJoke;
        }
    }

    public String getBestJoke() {
        return highestRatedJoke;
    }

    private static String getJokeFromWeb() {
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
