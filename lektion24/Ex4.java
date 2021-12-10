public class Ex4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("Hello World");
            }
        }, "Hello-Printer");

        t1.setDaemon(true);
        t1.start();

        Thread.sleep(1000);
    }
}
