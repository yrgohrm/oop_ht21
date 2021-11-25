import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {
    public static void main(String[] args) {
        Instant i = Instant.now();
        LocalDate d = LocalDate.now(); //of(2007, 10, 26);
        LocalDateTime dt = LocalDateTime.now();

        ZoneId eur = ZoneId.of("Europe/Stockholm");
        ZonedDateTime zdt = ZonedDateTime.now(eur);

        System.out.println(i);
        System.out.println(d);
        System.out.println(dt);
        System.out.println(zdt);
    }
}
