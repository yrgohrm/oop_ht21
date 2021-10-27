public class Ex1 {
    public static void main(String[] args) {
        try {
            int[] array = { 1, 2 };
            System.out.printf("%d", array[2]);
            System.out.println("hejsan");
        }
        catch (Exception ex) {
            System.err.println("Oops, det gick illa: "
                               + ex.getMessage());
        }

        System.out.println("Slut eller?");
    }
}
