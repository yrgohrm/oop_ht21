import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveNumber {
    private static int readPositiveNumber(Scanner scanner) {
        int n;
        do {
            try {
                System.out.println("Skriv in ett postivit heltal: ");
                n = scanner.nextInt();
            }
            catch (InputMismatchException ex) {
                n = -1; // make the while loop again
                scanner.next();
            }
        } while (n < 1);

        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        int n = readPositiveNumber(scanner);
        System.out.println("Detta är ett positivt heltal: " + n);
    }
}
