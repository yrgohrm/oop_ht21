import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        List<String> names = List.of("Hampus", "    ", "Nahid", "ANDERS", "Eva");

        names.stream()
            .map(String::toLowerCase)
            .filter(s -> s.endsWith("s"))
            // .filter(s -> {
            //     String s2 = s.toLowerCase();
            //     return s2.endsWith("s");
            // })
            // .filter(Lambda::endsWithS)
            .forEach(System.out::println);


            
    }

    private static boolean endsWithS(String s) {
        return s.endsWith("s");
    }
}
