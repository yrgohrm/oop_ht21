public class Ex3 {
    private static void whatWillItDo() {
        Integer[] array = {null, null};
        Integer i = array[(int) (Math.random() * 4)];
        i.toString();
    }

    public static void main(String[] args) {
        try {
            whatWillItDo();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Oops, det gick illa: " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.err.println("Gillar inte null...");
        }
    }
}
