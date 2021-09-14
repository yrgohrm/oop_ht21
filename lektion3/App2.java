import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vad heter du?");
        String name = scanner.nextLine();

        System.out.println("Hur gammal är du?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Vilket är ditt favoritdjur?");
        String favAnimal = scanner.nextLine();

        System.out.printf("Hej %s, du är %d år gammal.%n", name, age);
        System.out.println(favAnimal);
    }
}
