import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vilken gångertabell vill du se?");
        int table = scanner.nextInt();

        for (int i = 1; i <= 10; ++i) {
            int result = table * i;
            System.out.printf("%d x %2d = %d%n", table, i, result);
        }
    }
}
