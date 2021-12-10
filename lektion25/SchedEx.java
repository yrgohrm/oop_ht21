import java.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedEx {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
ScheduledExecutorService service = Executors.newScheduledThreadPool(0);

var thing = service.schedule(() -> {
    System.out.println("Now's the time!");
}, 10, TimeUnit.SECONDS);

service.scheduleAtFixedRate(() -> {
    System.out.println(Instant.now());
}, 0, 2, TimeUnit.SECONDS);

// wait for it to execute
thing.get();
service.shutdown();
    }
}
