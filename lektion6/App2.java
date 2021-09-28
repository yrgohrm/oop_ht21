import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hur bred skall den vara?");
        double width = scanner.nextDouble();

        Rectangle r = new Rectangle(width);
        r.print();

        Rectangle r2 = new Rectangle("blue");
        r2.print();

        Rectangle r3 = new Rectangle(1, 2, "cornflower blue");
        r3.print();
    }
}
