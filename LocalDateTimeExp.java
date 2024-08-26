import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExp{
// Write a method getCurrentDateTime() that returns the current date and time as a LocalDateTime object. Also, print the date-time in the format yyyy-MM-dd HH:mm:ss.
  //  Write a method isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2) that takes two LocalDateTime objects and returns true if dateTime1 is before dateTime2, otherwise returns false.
  public String  getCurrentDateTime() {
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
     LocalDateTime currDateTime = LocalDateTime.now();
     return currDateTime.format(formatter); 
  } 
  public boolean isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2){
    return dateTime1.isBefore(dateTime2);
  }
  public static void main(String[] args) {
    LocalDateTimeExp lDateTimeExp = new LocalDateTimeExp();
    String lDateTime = lDateTimeExp.getCurrentDateTime();
    System.out.println("Current Date and Time in the Format of yyyy-MM-dd HH:mm:ss: "+lDateTime);
    LocalDateTime dateTime1=LocalDateTime.of(2024, 8, 20, 10, 30);
    LocalDateTime dateTime2 = LocalDateTime.of(2024, 8, 21, 15, 45);
    boolean result =lDateTimeExp.isDateTimeBefore(dateTime1, dateTime2);
    System.out.println("DateTime1 is before DateTime2: "+result);
  }
}
