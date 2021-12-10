import java.util.concurrent.ThreadLocalRandom;

public class ThreadEx1 {
    private static class PrintRunner implements Runnable {
        public void run() {
            int random = ThreadLocalRandom.current().nextInt(10);
            for (int i = 0; i < 200; ++i) {
                System.out.print(random + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrintRunner pr1 = new PrintRunner();
        PrintRunner pr2 = new PrintRunner();

        Thread t1 = new Thread(pr1);
        Thread t2 = new Thread(pr2);

        t1.start();
        t2.start();

        for (int i = 0; i < 200; ++i) {
            System.out.print("Är vi klara nu?");
        }
    }
}