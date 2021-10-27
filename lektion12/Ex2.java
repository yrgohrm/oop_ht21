import java.util.Scanner;

public class Ex2 {
    public static int fac(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("fac not defined for n < 1");
        }


        if (n == 1) {
            return 1;
        } else {
            return n * fac(n-1);
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Fakultet för: ");
            int n = scanner.nextInt();
            System.out.println(fac(n));
        }
        catch (IllegalArgumentException ex) {
            System.err.println("Oops, det gick illa: "
                               + ex.getMessage());
        }
    }
}
