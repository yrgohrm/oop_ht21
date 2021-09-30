import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean shouldExit;
        do {
            shouldExit = handleOperation(scanner);
        } while (!shouldExit);
    }

    private static boolean handleOperation(Scanner scanner) {
        System.out.println("Skriv ett tal:");
        int number = getInt(scanner);

        System.out.println("Skriv in en operation dubbel, halva eller avbryt");
        String op = scanner.nextLine();

        if (op.equals("dubbel")) {
            System.out.println(number * 2);
        } else if (op.equals("halva")) {
            System.out.println(number / 2);
        } else {
            return true;
        }

        return false;
    }

    private static int getInt(Scanner scanner) {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
}
