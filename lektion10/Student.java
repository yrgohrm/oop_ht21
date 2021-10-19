public class Student extends Person {
    private String program;

    public Student() {
        System.out.println("Skapar en standardstudent");
        program = "Java Enterprise Utvecklare";
    }

    public Student(String name, String program) {
        super(name);
        System.out.println("Skapar en student");
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void sayHello() {
        System.out.println("Yo! " + getName());
    }
}
