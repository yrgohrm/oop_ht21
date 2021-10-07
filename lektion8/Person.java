public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0) {
            throw new RuntimeException();
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 13) {
            throw new RuntimeException();
        }
        this.age = age;
    }

}
