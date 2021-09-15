public class MultiplicationTable2 {
    public static void main(String[] args) {
        for (int table = 1; table <= 10; ++table) {
            for (int i = 1; i <= 10; ++i) {
                int result = table * i;
                System.out.printf("%d x %2d = %d%n", table, i, result);
            }
            System.out.println();
        }
    }
}
