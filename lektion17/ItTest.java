import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItTest {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();

        data.add("Hej");
        data.add("alla");
        data.add("glada");
        data.add("i");
        data.add("skolan");

        Iterator<String> it = data.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (it.hasNext()) {
                it.next();
            }
            System.out.println(s);
        }
    }
}
