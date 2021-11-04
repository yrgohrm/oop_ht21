import java.util.ArrayList;
import java.util.List;

public class Stuff {

    @Deprecated
    public static void doIt() {
        System.out.println("hello world");
    }

    public static void doItBetter() {
        System.out.println("Hello World!");
    }

    @SuppressWarnings("unchecked")
    public static List getIt() {
        List l = new ArrayList();
        l.add("hej");
        return l;
    }
}
