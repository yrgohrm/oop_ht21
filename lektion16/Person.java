import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        // int res = name.compareTo(o.name);
        // if (res == 0) {
        // return age - o.age;
        // }

        // return res;
        Comparator<Person> comp = Comparator.comparing(Person::getName)
                                            .thenComparingInt(Person::getAge)
                                            .reversed();
        return comp.compare(this, o);
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person p = (Person) obj;
        return p.age == this.age && p.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.age, this.name);
    }
}
