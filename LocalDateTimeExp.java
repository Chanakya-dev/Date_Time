import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class LocalDateTimeExp{

      // Method to get the current date and time as a LocalDateTime object
      public LocalDateTime getCurrentDateTime() {
          LocalDateTime currentDateTime = LocalDateTime.now();
          // Print the date-time in the format yyyy-MM-dd HH:mm:ss
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
          System.out.println("Current Date-Time: " + currentDateTime.format(formatter));
          return currentDateTime;
      }

      // Method to check if dateTime1 is before dateTime2
      public boolean isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2) {
          return dateTime1.isBefore(dateTime2);
      }

      public static void main(String[] args) {
          LocalDateTimeExp dateTimeExp = new LocalDateTimeExp();

          // Example usage of getCurrentDateTime
          LocalDateTime currentDateTime = dateTimeExp.getCurrentDateTime();

          // Example usage of isDateTimeBefore
          LocalDateTime dateTime1 = LocalDateTime.of(2024, 8, 27, 12, 30);
          LocalDateTime dateTime2 = LocalDateTime.of(2024, 8, 27, 13, 45);
          boolean isBefore = dateTimeExp.isDateTimeBefore(dateTime1, dateTime2);
          System.out.println("Is dateTime1 before dateTime2? " + isBefore);
      }
  }

