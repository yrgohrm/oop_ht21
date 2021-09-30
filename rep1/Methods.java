import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // we need to declare shouldExit outside of the loop
        // to be able to use it in the while-condition.
        boolean shouldExit;
        do {
            // we call handleOperation and send our scanner to it
            shouldExit = handleOperation(scanner);
        } while (!shouldExit);
    }

    /**
     * Reads a number and an operation from the given scanner and
     * prints out the result.
     * 
     * @param scanner the scanner to read the data from
     * @return true if the user wants to quit, false otherwise
     */
    private static boolean handleOperation(Scanner scanner) {
        System.out.println("Skriv ett tal:");
        // this will call the getInt method and pass along the scanner
        // the result value (what's returned inside getInt) will be
        // stored in the local variable "number"
        int number = getInt(scanner);

        System.out.println("Skriv in en operation dubbel, halva eller avbryt");
        String op = scanner.nextLine();

        if (op.equals("dubbel")) {
            System.out.println(number * 2);
        } else if (op.equals("halva")) {
            System.out.println(number / 2);
        } else {
            // we have decided that we return true if the user wants to quit
            return true;
        }

        // we have decided that we return false if the user wants to continue
        return false;
    }

    /**
     * Reads an integer from the given scanner and also reads and
     * discards the rest of that line. This is to prevent any dangling
     * newlines.
     * 
     * @param scanner the scanner to read from
     * @return the integer that we read from the scanner
     */
    private static int getInt(Scanner scanner) {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
}
