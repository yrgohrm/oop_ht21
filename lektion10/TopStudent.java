public class TopStudent extends Student {
    private String scholarship;

    public TopStudent() {
        System.out.println("Skapar en toppstudent");
        scholarship = "Adlerbertska stipendiefonden";
    }

    @Override
    public void doStuff() {
        //System.out.println("Hello " + scholarship.toLowerCase());
    }

    @Override
    public void sayHello() {
        System.out.println("Good day! " + getName());
    }
}
