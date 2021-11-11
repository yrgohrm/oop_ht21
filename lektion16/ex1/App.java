import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Lena", "Lamm", 1982));
        people.add(new Person("Bosse", "Bredsladd", 1952));
        people.add(new Person("Leyla", "Hamid", 1942));
        people.add(new Person("James", "Joyce", 1972));
        people.add(new Person("James", "Joyce", 1962));
        people.add(new Person("James", "Zoolander", 1972));

        Collections.sort(people);

        logger.info(people.toString()); //NOSONAR

        Comparator<Person> comp = new BirthYearComparator();

        Collections.sort(people, comp);

        logger.info(people.toString()); //NOSONAR

        Comparator<Person> comp2 = ShadyComparator.COMPARATOR;

        Collections.sort(people, comp2);

        logger.info(people.toString()); //NOSONAR

    }
}
