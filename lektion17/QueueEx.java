import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class QueueEx {
    public static void main(String[] args) {
        final Queue<String> queue = new ArrayBlockingQueue<>(10);

        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(() -> {
            for (int i = 0; i < 10; ++i) {
                System.out.println("Producer produces");
                queue.add("item " + i);
                sleep(150);
            }
        });

        for (int i = 0; i < 2; ++i) {
            service.submit(() -> {
                while (true) {
                    sleep(500 * ThreadLocalRandom.current().nextInt(3));
                    String str = queue.remove();
                    System.out.println("Consumer " + Thread.currentThread().getName() + " consumes: " + str);
                }
            });
        }
        
        service.shutdown();
    }


    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
