import java.util.Scanner;

public class StrEq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        if (name.equals("Hampus")) {
            System.out.println("Tjusigt namn!");
        }
        else {
            System.out.println("Ok, ett lagom namn.");
        }
    }
}
