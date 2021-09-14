import java.util.Scanner;

public class IfStmt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hur gammal är du?");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Du är myndig!");
            System.out.println("Dags att skaffa jobb och kamma sig!");
        }
        else {
            System.out.println("Du är omyndig.");
        }

        System.out.println("Tack för idag!");
    }
}
