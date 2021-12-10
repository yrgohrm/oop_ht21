public class Ex2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; ++i) {
                System.out.println("Hello");
            }
        });

        t1.start();

        for (int i = 0; i < 1; ++i) {
            System.out.println("World");
        }

        t1.join();

        System.out.println("Time to quit");
    }
}
