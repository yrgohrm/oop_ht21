
public class App2 {
    public static void main(String[] args) {
        boolean retry = false;
        do {
            try {
                doStuff();
            }
            catch (RuntimeException ex) {
                // should not happen
            }
        } while (retry);
    }

    private static void doStuff() {
        doOtherStuff();
    }

    private static void doOtherStuff() {
            // ....
    }


}
