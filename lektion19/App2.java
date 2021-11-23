public class App2 {
    public static void main(String[] args) {
        Computer c = new IbmComputer();
        doStuffWithComputer(c);

        doStuffWithComputer(i -> i + 1);
    }

    private static void doStuffWithComputer(Computer c) {
        int res = c.compute(99);
        System.out.println(res);
    }
}
