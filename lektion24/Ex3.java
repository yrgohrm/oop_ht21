public class Ex3 {
    public static class Adder {
        private int value = 0;

        public synchronized void addOne() {
            value = get() + 1;
        }

        public int get() {
            return value;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final Adder adder = new Adder();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; ++i) {
                adder.addOne();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; ++i) {
                adder.addOne();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println(adder.get());
    }
}
