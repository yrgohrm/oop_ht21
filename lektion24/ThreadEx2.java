public class ThreadEx2 {
    private static class Interruptable implements Runnable {
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Jobbar...");

                
                try {
                    Thread.sleep(50);
                }
                catch (InterruptedException ex) {
                    // always reset the interrupt status
                    Thread.currentThread().interrupt();
                    System.out.println("Avbruten"); 
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Interruptable());
        t1.start();

        Thread.sleep(500);
     
        t1.interrupt();
        t1.join();

        System.out.println("Exiting main thread...");
    }
}