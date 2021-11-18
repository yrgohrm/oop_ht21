import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        Pair3<String> p = new Pair3<>();
        p.value1 = "Hej";
        p.value2 = "Halloj";
    }

    public static boolean isOdd(List<?> list) {
        return list.size() % 2 != 0;
    }

    public static <T extends Comparable<T>> boolean isSame(T o1, T o2, T o3) {
        if (o1 == null && o2 == null && o3 == null) {
            return true;
        }
        
        if (o1 == null || o2 == null || o3 == null) {
            return false;
        }
        
        return o1.compareTo(o2) == 0 && o2.compareTo(o3) == 0;
    }
}
