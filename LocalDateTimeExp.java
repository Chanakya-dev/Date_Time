import java.time.LocalDateTime;

public class LocalDateTimeExp{
// Write a method getCurrentDateTime() that returns the current date and time as a LocalDateTime object. Also, print the date-time in the format yyyy-MM-dd HH:mm:ss.
  //  Write a method isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2) that takes two LocalDateTime objects and returns true if dateTime1 is before dateTime2, otherwise returns false.
  static LocalDateTime getCurrentDateTime(){
    LocalDateTime present=LocalDateTime.now();
    return present;
  }

  static boolean isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2){
    if (dateTime1.isBefore(dateTime2)){
      return true;
    }
   return false; 
  }

  public static void main(String[] args) {
    System.out.println(getCurrentDateTime());
    System.out.println(isDateTimeBefore(LocalDateTime.of(2026, 4, 29, 8,  30,35),LocalDateTime.of(2025,3,23,9,30,34)));
  }
}
