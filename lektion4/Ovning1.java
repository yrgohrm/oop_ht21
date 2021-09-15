import java.util.Scanner;

public class Ovning1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in ett startvärde för fakulteten:");
        int n = scanner.nextInt();

        // 5! = 5 * 4 * 3 * 2 * 1
        // 3! = 3 * 2 * 1

        int product = 1;
        for (int i = n; i > 0; --i) {
            product = product * i;
        }

        System.out.println("Svaret är: " + product);
    }
}
