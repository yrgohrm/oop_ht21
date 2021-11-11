import java.util.Comparator;

public class ShadyComparator implements Comparator<Person> {
    public static final Comparator<Person> COMPARATOR = new ShadyComparator();

    private ShadyComparator() {}

    @Override
    public int compare(Person o1, Person o2) {
        Comparator<Person> comp =
                Comparator.comparing(Person::getFirstName, Comparator.reverseOrder()).thenComparing(Person::getLastName)
                        .thenComparingInt(Person::getBirthYear).reversed();
                        
        return comp.compare(o1, o2);
    }
}
