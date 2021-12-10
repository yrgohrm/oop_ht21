import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class StreamEx {
    static String[] firstNames = {
        "Pelle",
        "Bosse",
        "Lena",
        "Leyla",
        "Amir",
        "Petra"
    };

    static String[] lastNames = {
        "Andersson",
        "Hamid",
        "Karlsson",
        "Smith",
        "Hassan",
        "Jansson"
    };

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(100000);
        for (int i = 0; i < 5000000; ++i) {
            String firstName = firstNames[ThreadLocalRandom.current().nextInt(firstNames.length)];
            String lastName = lastNames[ThreadLocalRandom.current().nextInt(lastNames.length)];
            names.add(firstName + " " + lastName);
        }

        long start = System.nanoTime();
        names.stream()//.parallel()
            .map(String::toUpperCase)
            .filter(s -> s.length() > 12)
            .distinct()
            .sorted()
            .limit(10)
            .forEach(System.out::println);
        long diff = System.nanoTime() - start;
        System.out.println("?s: " + (diff / 1_000_000));
    }
}
