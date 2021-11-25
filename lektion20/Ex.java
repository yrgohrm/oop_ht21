import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ex {
    public static void main(String[] args) {
        ZoneId nyTimeZone = ZoneId.of("America/New_York");
        ZoneId gbgTimeZone = ZoneId.of("Europe/Stockholm");

        var ny = ZonedDateTime.now(nyTimeZone);
        var gbg = ZonedDateTime.now(gbgTimeZone);

        var timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println(ny.format(timeFormat));
        System.out.println(gbg.format(timeFormat));
    }
}
