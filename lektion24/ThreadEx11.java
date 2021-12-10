import java.util.concurrent.ThreadLocalRandom;

public class ThreadEx11 {
    public static void main(String[] args) throws InterruptedException {
        Runnable func = () -> {
            int random = ThreadLocalRandom.current().nextInt(10);
            for (int i = 0; i < 200; ++i) {
                System.out.print(random + " ");
            }
        };

        Thread t1 = new Thread(func);
        Thread t2 = new Thread(func);

        t1.start();
        t2.start();
       
        for (int i = 0; i < 200; ++i) {
            System.out.print("Är vi klara nu?");
        }
    }
}