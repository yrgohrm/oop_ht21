import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItEx {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anne Quaker");
        names.add("Jemima Honore");
        names.add("Liza Minelli");
        names.add("Minnie Driver");

        // print the names in backwards order
        ListIterator<String> li = names.listIterator(names.size());
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
