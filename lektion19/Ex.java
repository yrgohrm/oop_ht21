import java.util.List;

public class Ex {
    public static void main(String[] args) {
        List<String> names = List.of("Hampus", "  Nisse Nilsson",
                                     "Bosse Bredsladd   ", "a" , "    ");

        for (int i = 0; i < names.size(); ++i) {
            System.out.println(names.get(i));
        }

        for (String name : names) {
            System.out.println(name);
        }

        names.stream().forEach(System.out::println);
        
        names.stream()
            .map(String::trim)
            .forEach(System.out::println);

        names.stream()
            .map(s -> s.replaceAll("\\s", ""))
            .map(String::toLowerCase)
            .forEach(System.out::println);
        
        names.stream()
            .map(s -> s.replaceAll("\\s", ""))
            .filter(s -> s.length() >= 2)
            .map(String::toLowerCase)
            .forEach(System.out::println);
        
    }
}
