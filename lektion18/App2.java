import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Integer> l = List.of(1,2,3);
        var l2 = List.of("hej", "på", "dig");

        System.out.println(halfSize(l));
        System.out.println(halfSize(l2));
    }

    private static <T> int halfSize(List<T> theList) {
        return theList.size() / 2;
    }
}
