public class App {
    public static void main(String[] args) {
        TopStudent topStudent = new TopStudent(); //"Jennie Jenniesson", "Java Enterprise Utvecklare");
        // System.out.println(student.getName());
        // System.out.println(student.getProgram());
        // student.sayHello();

        Person nisse = new Person("Nisse Nissesson");
        // nisse.sayHello();
        // // System.out.println(nisse.getName());
        // // System.out.println(nisse.getProgram());

        Student student = new Student("Lena Lamm", "Ekonomiassistent");

        Person[] persons = { topStudent, nisse, student };
        for (Person p : persons) {
            p.sayHello();
        }

        System.out.println(persons[1] instanceof TopStudent);
        System.out.println(persons[1] instanceof Student);
    }
}