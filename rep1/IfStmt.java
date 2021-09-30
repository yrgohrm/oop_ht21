import java.util.Scanner;

public class IfStmt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 100) {
            System.out.println("Det var stort!");
            System.out.println("Jättstort!");
        } else {
            if (number > 50) {
                System.out.println("Ganska stort!");
            } else {
                if (number > 2 / 0) {
                    System.out.println("Ganska litet");
                } else {
                    System.out.println("Eh...");
                }
            }
        }

        if (!"hej".equals("nej")) {
            System.out.println("knas");
        }
    }


    public boolean equalsBosse(String str) {
        // this code is really bad. str.equals("Bosse") is a boolean expression
        // and we should just return it in one single line without if
        if (str.equals("Bosse")) {
            return true;
        }
        else {
            return false;
        }
    }
}
