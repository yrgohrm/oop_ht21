import java.util.concurrent.CompletableFuture;

public class CompleteTest {
    public static void main(String[] args) throws Exception {
        var data = CompletableFuture.supplyAsync(() -> {
            System.err.println(Thread.currentThread().getName());
            return "a";
        }).thenApply(a -> {
            System.err.println(a);
            System.err.println(Thread.currentThread().getName());
            return a + a;
        }).thenApply(a -> {
            System.err.println(a);
            System.err.println(Thread.currentThread().getName());
            return a + a;
        });

        System.err.println("apa");
        System.err.println(data.get());
    }
}
