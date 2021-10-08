import java.util.Scanner;

public class Ovn2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vad heter du?");
        String name = input.nextLine();

        while (name.trim().length() == 0) {
            System.out.println("Kom igen nu. Vad heter du?");
            name = input.nextLine();
        }

        System.out.println("Hej " + name);
    }
}
