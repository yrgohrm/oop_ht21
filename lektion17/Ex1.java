import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Ex1 {
    public static void main(String[] args) {
        Collection<String> ticketHolders = new ArrayList<>();

        ticketHolders.add("Bosse Bredsladd");
        ticketHolders.add("Emma Emrik");
        ticketHolders.add("Lena Lamm");
        ticketHolders.add("Leyla Holt");
        ticketHolders.add("Leyla Holt");
        ticketHolders.add("Leyla Holt");
        ticketHolders.add("Leyla Holt");
        ticketHolders.add("Leyla Holt");
        ticketHolders.add("Leyla Holt");
        ticketHolders.add("Leyla Holt");
        ticketHolders.add("Leyla Holt");
        ticketHolders.add("Leyla Holt");
        ticketHolders.add("Leyla Holt");
        ticketHolders.add("Leyla Holt");


        Map<String, Integer> winnerCount = new HashMap<>();
        for (int i = 0; i < 1000; ++i) {
            String winnerName = getWinner(ticketHolders);
            int hasWon = winnerCount.getOrDefault(winnerName, 0);
            winnerCount.put(winnerName, hasWon + 1);

            // if (winnerCount.containsKey(winnerName)) {
            //     int hasWon = winnerCount.get(winnerName);
            //     winnerCount.put(winnerName, hasWon + 1);
            // }
            // else {
            //     winnerCount.put(winnerName, 1);
            // }
        }

        for (Map.Entry<String, Integer> entry : winnerCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static String getWinner(Collection<String> ticketHolders) {
        int winner = ThreadLocalRandom.current().nextInt(ticketHolders.size());

        Iterator<String> it = ticketHolders.iterator();
        while (it.hasNext() && winner != 0) {
            it.next();
            winner--; // winner = winner - 1;
        }

        return it.next();
    }
}
