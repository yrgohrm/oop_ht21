import java.util.Scanner;

public class EBoolTest {
    public static void main(String[] args) {
        String defaultGreeting = "Hej på dig!";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vad heter du?");
        String name = scanner.nextLine();

        if (name.equals("Hampus")) {
            System.out.println("Hur gammal är du?");
            int age = scanner.nextInt();

            if (age > 30) {
                System.out.println("Är du lärare kanske?");
            }
            else {
                System.out.println(defaultGreeting);    
            }
        }
        else {
            System.out.println(defaultGreeting);
        }
    }
}
