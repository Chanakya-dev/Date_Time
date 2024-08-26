import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExp{
// Write a method getCurrentDateTime() that returns the current date and time as a LocalDateTime object. Also, print the date-time in the format yyyy-MM-dd HH:mm:ss.
  //  Write a method isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2) that takes two LocalDateTime objects and returns true if dateTime1 is before dateTime2, otherwise returns false.
public static void main(String[] args) {
   LocalDateTime now = getCurrentDateTime();
        System.out.println("Current date and time: " + now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 8, 25, 14, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(2024, 8, 26, 14, 30);
        boolean result = isDateTimeBefore(dateTime1, dateTime2);
        System.out.println("Is dateTime1 before dateTime2? " + result);
}
        public static LocalDateTime getCurrentDateTime() {
          return LocalDateTime.now();
      }
      public static boolean isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2) {
          return dateTime1.isBefore(dateTime2);
      }
  }


