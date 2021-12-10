import java.time.temporal.ChronoUnit;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class CompFut {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Doing big task!");
            sleep(1000);
            return "hello";
        }).thenApply(s -> {
            System.out.println("Another big task!");
            return s + " world";
        }).thenAccept(s -> {
            System.out.println(s);
        }).exceptionally(ex -> {
            System.out.println("Exception: " + ex.getMessage());
            return null;
        });

        System.out.println("XXXXXXXX");

        ForkJoinPool.commonPool().awaitQuiescence(1, TimeUnit.DAYS);
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
