import java.text.DateFormatSymbols;
import java.util.Locale;

public class Ex3 {
    public static void main(String[] args) {
        Locale currentLocale = Locale.forLanguageTag("gsw-CH");
        final DateFormatSymbols datesyms = new DateFormatSymbols(currentLocale);
        for (String month : datesyms.getMonths()) {
            System.out.println(month);
        }
    }
}
