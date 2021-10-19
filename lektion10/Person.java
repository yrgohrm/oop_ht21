public class Person {
    private String name;

    public Person() {
        System.out.println("Skapar en person vid namn Bosse");
        name = "Bosse Bredsladd";
        doStuff();
    }

    public Person(String name) {
        System.out.println("Skapar en person");
        this.name = name;
        doStuff();
    }

    public void doStuff() {
        System.out.println("Hallå eller!!!");
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}