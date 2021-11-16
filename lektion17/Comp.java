import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comp {
    public static void main(String[] args) {
        AddressBookEntry e1 = new AddressBookEntry("Nisse", "nisse@bosse.com", "911");
        AddressBookEntry e2 = new AddressBookEntry("Lena", "lena@bosse.com", "112");

        List<AddressBookEntry> addressBook = new ArrayList<>();
        addressBook.add(e1);
        addressBook.add(e2);

        Comparator<AddressBookEntry> comp =
                Comparator.comparing(AddressBookEntry::getPhone, Comparator.naturalOrder())
                .thenComparing(AddressBookEntry::getName);

        Collections.sort(addressBook, comp);

        System.out.println(addressBook);
    }
}
