import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static int evenSum(List<Integer> numbers) {
        int sum = 0;

        for (Integer i : numbers) {
            if (i != null && i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        
        numbers.add(24);
        numbers.add(4);
        numbers.add(3);
        numbers.add(null);

        System.out.println("Summan är: " + evenSum(numbers));
    }
}
