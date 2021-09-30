public class App1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int c = a + b + a * b;

        c += 4; // c = c + 4;
        c -= a + b; // c = c - (a+b);

        System.out.println(c);
    }
}