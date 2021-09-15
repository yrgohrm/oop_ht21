import java.util.Scanner;

public class DoWhileStmt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            number = scanner.nextInt();
            System.out.println("Du skrev in: " + number);
        } while (number != 0);

        // exakt samma som ovan

        number = scanner.nextInt();
        System.out.println("Du skrev in: " + number);
        while (number != 0) {
            number = scanner.nextInt();
            System.out.println("Du skrev in: " + number);
        }

        System.out.println("Färdig!");
    }
}
