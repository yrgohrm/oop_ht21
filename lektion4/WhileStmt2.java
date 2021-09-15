import java.util.Scanner;

public class WhileStmt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Har du roligt nu? (ja/nej)");
        String answer = scanner.nextLine();

        while (!answer.equals("ja") && !answer.equals("nej")) {
            System.out.println("Du måste svara ja eller nej!");
            answer = scanner.nextLine();
        }

        System.out.println("Färdig! Du svarade: " + answer);
    }
}
