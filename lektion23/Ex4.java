import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Ex4 {
    public static void main(String[] args) {
        final Locale currentLanguage = Locale.forLanguageTag(args.length > 0 ? args[0] : "sv-SE");

        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(currentLanguage);


            final int NUMBER_COUNT = 3;
            final ResourceBundle bundle = ResourceBundle.getBundle("ex4", currentLanguage);

            System.out.printf(bundle.getString("inputnum"), NUMBER_COUNT);
            double[] values = new double[NUMBER_COUNT];
            for (int i = 0; i < NUMBER_COUNT; ++i) {
                values[i] = scanner.nextDouble();
            }

            double avg = DoubleStream.of(values).sum() / NUMBER_COUNT;
            System.out.printf(currentLanguage, bundle.getString("average"), avg);
        }
    }
}
