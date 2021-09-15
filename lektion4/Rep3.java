import java.util.Scanner;

public class Rep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String theLine = scanner.nextLine();
        int theValue = scanner.nextInt();
        scanner.nextLine();

        String anotherLine = scanner.nextLine();

        System.out.println(theLine);
        System.out.println(theValue);
        System.out.println("The last line: " + anotherLine);
    }
}
