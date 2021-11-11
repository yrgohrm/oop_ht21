import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Bosse", 63);
        Person p2 = new Person("Lena", 45);
        Person p3 = new Person("Leyla", 32);

        // namn först sedan ålder
        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p3));
        System.out.println(p1.compareTo(p3));

        System.out.println("------");

        // bara ålder
        Comparator<Person> personComp = new AgeComparator();
        System.out.println(personComp.compare(p1, p2));
        System.out.println(personComp.compare(p2, p3));
        System.out.println(personComp.compare(p1, p3));
        
        // bara ålder
        Comparator<Person> personComp2 = Comparator.comparing(Person::getName);
        System.out.println(personComp2.compare(p1, p2));
        System.out.println(personComp2.compare(p2, p3));
        System.out.println(personComp2.compare(p1, p3));

        List<Person> personList = new ArrayList<>();
        personList.add(p2);
        personList.add(p3);
        personList.add(p1);

        System.out.println(personList);
        System.out.println("----");
        
        personList.sort(personComp2);
        
        System.out.println(personList);
    }
}