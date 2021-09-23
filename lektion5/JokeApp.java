import java.util.Scanner;

public class JokeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JokeRater rater = new JokeRater();

        String answer;
        do {
            String joke = rater.getJoke();
            System.out.println(joke);

            System.out.println("Vad får skämetet för betyg?");
            int rating = scanner.nextInt();
            scanner.nextLine();

            rater.rateLastJoke(rating);

            System.out.println("Vill du betygsätta ett till? (j/n)");
            answer = scanner.nextLine();
        } while (answer.equals("j"));

        System.out.println("Bästa skämtet var:");
        System.out.println(rater.getBestJoke());
    }
}
