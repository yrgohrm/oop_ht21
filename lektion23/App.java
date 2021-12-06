import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("sr-Latn-RS"); //new Locale("en", "US");

        NumberFormat nf = NumberFormat.getInstance(locale);
        String pi = nf.format(StrictMath.PI);
        System.out.println(pi);

        DateTimeFormatter df = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.SHORT).withLocale(locale);
        LocalDateTime dt = LocalDateTime.now();
        String date = dt.format(df);
        System.out.println(date);

        String misc = String.format(locale, "%d %.5f", Integer.MAX_VALUE, StrictMath.PI);
        System.out.println(misc);
    }
}
