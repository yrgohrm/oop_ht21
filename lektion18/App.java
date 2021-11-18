import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static class Pair<T1, T2> {
        public T1 value1;
        public T2 value2;

        public void setValue1(T1 obj) {
            this.value1 = obj;
        }
    }

    public static void main(String[] args) {

        var x = new HashMap<String, List<Map<Integer, String>>>();

        var res = replaceNumber("You won $1 000 000!!");

        var newString = res.value1;
        var count = res.value2;
        System.out.printf("Returned string in upper case: %s%n", newString.toUpperCase());
        System.out.printf("Square of returned count: %d%n", count * count);
    }

    private static Pair<String, Integer> replaceNumber(String str) {
        var builder = new StringBuilder();
        var count = 0;

        for (var i = 0; i < str.length(); ++i) {
            var ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                builder.append('*');
                count++;
            }
            else {
                builder.append(ch);
            }
        }

        var sandi = new Pair<String, Integer>();
        sandi.value2 = count;
        sandi.value1 = builder.toString();

        return sandi;
    }
}