import java.time.LocalDateTime;
public class LocalDateTimeExp{
// Write a method getCurrentDateTime() that returns the current date and time as a LocalDateTime object. Also, print the date-time in the format yyyy-MM-dd HH:mm:ss.
  //  Write a method isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2) that takes two LocalDateTime objects and returns true if dateTime1 is before dateTime2, otherwise returns false.
public static void main(String[] args) {
LocalDateTime dateTime = LocalDateTime.now();
System.out.println("Current date-time: " + dateTime);
LocalDateTime dateTime1 = LocalDateTime.of(2020, 1, 1, 0, 0);
LocalDateTime dateTime2 = LocalDateTime.of(2020, 1, 2, 0, 0);
boolean result = dateTime1.isBefore(dateTime2);
System.out.println("Is dateTime1 before dateTime2? " + result);
}
}
