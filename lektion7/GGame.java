import java.util.Scanner;

public class GGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessingGame game = new GuessingGame();

        while (true) {
            System.out.println("Gissa det hemliga nummret:");
            int guessedNumber = scanner.nextInt();
            int res = game.guess(guessedNumber);
            if (res == 0) {
                System.out.println("Du gissade rätt!");
                break;
            }
            else if (res == -1) {
                System.out.println("Det sökta talet är mindre.");
            }
            else {
                System.out.println("Det sökta talet är större.");
            }
        }

        System.out.printf("Det tog dig %d gissningar!%n", game.getGuesses());
    }
}
