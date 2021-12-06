import java.util.Locale;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Ex1 {
    public static void main(String[] args) {
        // final Locale currentLanguage = Locale.forLanguageTag("en-GB");
        final Locale currentLanguage = Locale.forLanguageTag("sv-SE");

        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(currentLanguage);

            final int NUMBER_COUNT = 3;

            double[] values = new double[NUMBER_COUNT];
            for (int i = 0; i < NUMBER_COUNT; ++i) {
                values[i] = scanner.nextDouble();
            }

            double avg = DoubleStream.of(values).sum() / NUMBER_COUNT;
            System.out.printf(currentLanguage, "%.2f%n", avg);
        }
    }
}
