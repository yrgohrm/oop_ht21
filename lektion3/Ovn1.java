import java.util.Scanner;

public class Ovn1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Skriv in höjd:");
        double height = scanner.nextDouble();
        
        System.out.println("Skriv in bredd:");
        double width = scanner.nextDouble();

        double area = height * width;
        double circumference = 2 * height + 2 * width;

        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Omkrets: %.2f%n", circumference);

        if (area > 1000) {
            System.out.println("Den är jättestor!");
        }
    }
}
