public class OvningEtt {
    public static int sum(int[] values) {
        int result = 0;
        for (int i = 0; i < values.length; ++i) {
            result = result + values[i];
        }
        return result;
    }

    public static double sum(double[] values) {
        double result = 0;
        for (double val : values) {
            result = result + val;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = { 3, -3, 4, -4, 22, -22 };
        System.out.println(sum(data));

        double[] dblData = { 2.2, -2.2, 3.3, -3.3, 22.0 };
        System.out.println(sum(dblData));
    }
}
