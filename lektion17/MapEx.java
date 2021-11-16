import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx {
    public static void main(String[] args) {
        Map<String, String> addressBook = new HashMap<>();
        
        addressBook.put("Hans Ramberg", "Programmerargränd 2");
        addressBook.put("Elin Lahti", "Storgatan 12B");
        addressBook.put("James Smith", "Tellus Drive 27");


        if (addressBook.containsKey("Nisse Bosse")) {
            String addr = addressBook.get("Nisse Bosse");
            System.out.println(addr);
        }

        for (Map.Entry<String, String> entry : addressBook.entrySet()) {
            System.out.println(entry.getKey() + " bor på " + entry.getValue());
        }

        // String elinsAddress = addressBook.get("Elin Lahti");
        // System.out.println(elinsAddress);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Vem vill du ändra på?");
            String name = scanner.nextLine();
            if (addressBook.containsKey(name)) {
                System.out.println("Skriv in ny adress:");
                String newAddr = scanner.nextLine();

                addressBook.put(name, newAddr);
            }
            else {
                System.out.println("Finns inte i boken.");
            }
        }

        for (Map.Entry<String, String> entry : addressBook.entrySet()) {
            System.out.println(entry.getKey() + " bor på " + entry.getValue());
        }
    }
}
