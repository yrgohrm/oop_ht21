import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> data = new HashSet<>();
        data.add("Hejsan");
        data.add("Hoppsan");
        data.add("Hejsan");
        data.add("Hejsan");
        data.add("Hejsan");
        data.add("Hejsan");

        for (String value : data) {
            System.out.println(value);
        }
    }
}
