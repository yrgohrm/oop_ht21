import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 3; i <= num; ++i) {
            System.out.println(i);
        }
        
        for (int i = 3; i < num + 1; ++i) {
            System.out.println(i);
        }

        for (int i = 3; i <= num; i=i+1) {
            System.out.println(i);
        }
    }
}