import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExp{
// Write a method getCurrentDateTime() that returns the current date and time as a LocalDateTime object. Also, print the date-time in the format yyyy-MM-dd HH:mm:ss.
  //  Write a method isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2) that takes two LocalDateTime objects and returns true if dateTime1 is before dateTime2, otherwise returns false.

   public LocalDateTime getCurrentDateTime() {
    LocalDateTime currentDateTime = LocalDateTime.now();

   
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = currentDateTime.format(formatter);
    System.out.println("Current Date and Time: " + formattedDateTime);

    return currentDateTime;
}

public boolean isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2) {
    return dateTime1.isBefore(dateTime2);
}

public static void main(String[] args) {
    LocalDateTimeExp dateTimeExp = new LocalDateTimeExp();

    // Example usage of getCurrentDateTime method
    LocalDateTime currentDateTime = dateTimeExp.getCurrentDateTime();

    // Example usage of isDateTimeBefore method
    LocalDateTime dateTime1 = LocalDateTime.of(2024, 8, 26, 10, 0);  
    LocalDateTime dateTime2 = LocalDateTime.of(2024, 8, 26, 12, 0);  
    // Check if dateTime1 is before dateTime2
    boolean isBefore = dateTimeExp.isDateTimeBefore(dateTime1, dateTime2);
    System.out.println("Is dateTime1 before dateTime2? " + isBefore);
}
  
}
