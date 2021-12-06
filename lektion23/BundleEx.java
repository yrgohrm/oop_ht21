import java.util.Locale;
import java.util.ResourceBundle;

public class BundleEx {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        // Locale locale = new Locale("sv", "SE");
        ResourceBundle bundle = ResourceBundle.getBundle("translations", locale);

        System.out.println(bundle.getString("hello"));

        String text = String.format(locale, bundle.getString("magicNumbers"), 22, Math.PI);
        System.out.println(text);
    }
}
