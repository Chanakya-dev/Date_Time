import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExp{
// Write a method getCurrentDateTime() that returns the current date and time as a LocalDateTime object. Also, print the date-time in the format yyyy-MM-dd HH:mm:ss.
 //  Write a method isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2) that takes two LocalDateTime objects and returns true if dateTime1 is before dateTime2, otherwise returns false.
  public LocalDateTime getCurrentDateTime() {
       
        LocalDateTime now = LocalDateTime.now();
       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
       
        System.out.println("Current Date and Time: " + now.format(formatter));
        return now;
    }


    public boolean isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2) {
       
        return dateTime1.isBefore(dateTime2);
    }

    public static void main(String[] args) {
        LocalDateTimeExp localDateTimeExp = new LocalDateTimeExp();

        LocalDateTime currentDateTime = localDateTimeExp.getCurrentDateTime();

        
        LocalDateTime futureDateTime = LocalDateTime.of(2024, 12, 31, 23, 59, 59);
        boolean isBefore = localDateTimeExp.isDateTimeBefore(currentDateTime, futureDateTime);
        System.out.println("Is current date-time before future date-time? " + isBefore);
    }
}

