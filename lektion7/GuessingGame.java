import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    private int secretNumber;
    private int guesses;

    public GuessingGame() {
        this.secretNumber = ThreadLocalRandom.current().nextInt(1, 11);
        this.guesses = 0;
    }

    public int guess(int number) {
        guesses++;

        if (number == secretNumber) {
            return 0;
        }
        else if (number > secretNumber) {
            return -1;
        }
        else {
            return 1;
        }
    }

    public int getGuesses() {
        return guesses;
    }
}
