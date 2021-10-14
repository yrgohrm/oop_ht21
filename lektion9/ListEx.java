import java.util.LinkedList;
import java.util.List;

public class ListEx {
    public static void printReverse(List<String> list) {
        for (int i = list.size()-1; i >= 0; --i) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> myList = new LinkedList<>();

        System.out.println(myList.size());
        
        myList.add("Hej");
        myList.add("alla glada");

        System.out.println(myList.size());

        myList.remove(0);

        myList.add(0, "Halloj");
        myList.add("!!!");
        myList.add("???");

        for (String val : myList) {
            System.out.println(val);
        }

        System.out.println(myList.get(0));

        printReverse(myList);
    }
}
