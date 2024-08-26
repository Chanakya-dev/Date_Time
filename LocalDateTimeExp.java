import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExp {

    public LocalDateTime getCurrentDateTime() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Current Date and Time: " + dtf.format(dateTime));
        return dateTime;
    }

    public boolean isDateTimeBefore(LocalDateTime Time1, LocalDateTime Time2) {
        return Time1.isBefore(Time2);
    }

    public static void main(String[] args) {
        LocalDateTimeExp lde = new LocalDateTimeExp();

        
        LocalDateTime Time1 = lde.getCurrentDateTime();
        LocalDateTime Time2 = lde.getCurrentDateTime();

        
        boolean isBefore = lde.isDateTimeBefore(Time1, Time2);

        System.out.println("Is dateTime1 before dateTime2? " + isBefore);
    }
}
