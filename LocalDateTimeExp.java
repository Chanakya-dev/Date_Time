import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class LocalDateTimeExp
{
// Write a method getCurrentDateTime() that returns the current date and time as a LocalDateTime object. Also, print the date-time in the format yyyy-MM-dd HH:mm:ss.
public void getCurrentDateTime()
{
   LocalDateTime CurrentDateTime=LocalDateTime.now();
   System.out.println("Current Date and Time => "+CurrentDateTime);
   DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
   String FormattedDateandTime = CurrentDateTime.format(formatter);
   System.out.println("Formatted Date And Time => "+ FormattedDateandTime);

}

  //  Write a method isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2) that takes two LocalDateTime objects and returns true if dateTime1 is before dateTime2, otherwise returns false.
  public boolean isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2)
  {
    return dateTime1.isBefore(dateTime2);
  }

  public static void main(String[] args) 
  {
     LocalDateTimeExp aobj=new LocalDateTimeExp();
     aobj.getCurrentDateTime();

     LocalDateTime dateTime1= LocalDateTime.of(2002, 10, 10, 10, 10, 10);
     LocalDateTime dateTime2=LocalDateTime.of(2002, 10, 11, 10, 15, 7);

     boolean result=aobj.isDateTimeBefore(dateTime1, dateTime2);
     System.out.println("Is Date1 before Date2 => "+result);

  }
}