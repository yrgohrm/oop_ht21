import java.util.Scanner;

public class WhileStmt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theValue = scanner.nextInt();

        while (theValue > 0) {
            System.out.print("Ännu en loop! ");
            System.out.println(theValue);
            theValue--;
        }

        System.out.println("Färdig!");
    }
}
