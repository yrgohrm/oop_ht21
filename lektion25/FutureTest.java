import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newCachedThreadPool();

        Future<String> f1 = service.submit(() -> {
            sleep(4000);
            return "Hello";
        });

        Future<String> f2 = service.submit(() -> {
            sleep(1000);
            return "World";
        });

        while (!f1.isDone() || !f2.isDone()) {
            sleep(500);
            System.out.println("Not done yet. We could do other stuff here.");
            System.out.printf("f1: %b, f2: %b%n", f1.isDone(), f2.isDone());
        }

        String hello = f1.get();
        String world = f2.get();

        System.out.println(hello + " " + world);

        service.shutdown();
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
