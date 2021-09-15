import java.util.Scanner;

public class Rep5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theValue = scanner.nextInt();

        if (theValue < 1000)
            System.out.println("Det var ett litet tal!");
        else {
            System.out.println("Det var ett stort tal!");
            System.out.println("Kan du skriva ett större?");
        }
        
    }
}
