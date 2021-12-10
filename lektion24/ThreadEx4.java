public class ThreadEx4 {
    private static class Sync {
        public synchronized void doStuff() {
            try {
                System.out.println("sleepy");
                Thread.sleep(2000);
                System.out.println("sleep end");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        final Sync sync = new Sync();

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 start");
            sync.doStuff();
            System.out.println("Thread 1 stop");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 start");
            sync.doStuff();
            System.out.println("Thread 2 stop");
        });

        t1.start();
        t2.start();
    }
}
