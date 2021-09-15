import java.util.Scanner;

public class Rep4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theValue = scanner.nextInt();

        if (theValue < 1000) {
            System.out.println("Det var ett litet tal!");
        } else if (theValue > 8000000) {
            System.out.println("Det var ett jätteenormt tal!");
        } else if (theValue > 1000000) {
            System.out.println("Det var ett enormt tal!");
        } else {
            System.out.println("Det var ett stort tal!");
        }
    }
}
