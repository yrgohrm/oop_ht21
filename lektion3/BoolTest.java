import java.util.Scanner;

public class BoolTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vad heter du?");
        String name = scanner.nextLine();

        System.out.println("Hur gammal är du?");
        int age = scanner.nextInt();

        if (name.equals("Hampus") && age >= 30) {
            System.out.println("Är du lärare kanske?");
        }
        else {
            System.out.println("Hej på dig.");
        }
    }
}
