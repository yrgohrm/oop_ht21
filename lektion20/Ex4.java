import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex4 {
    public static void main(String[] args) {
        var now = LocalDate.now();
        var endOfYear = LocalDate.of(now.getYear(), 12, 31);

        long days = ChronoUnit.DAYS.between(now, endOfYear);
        System.out.println("Days to newyear: " + days);
    }
}
