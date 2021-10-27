public class Ex3_1 {
    private static int lightSpeedPerUnit(int val) {
        return 299_792_458 / val;
    }

    private static int lightSpeedPerKm() {
        try {
            return lightSpeedPerUnit(0); // oops...
        } catch (IllegalArgumentException ex) {
            System.err.println("First: " + ex.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {
        try {
            int speed = lightSpeedPerKm();
            System.out.println(speed);
        } catch (ArithmeticException ex) {
            System.err.println("Second: " + ex.getMessage());
        }
    }
}
