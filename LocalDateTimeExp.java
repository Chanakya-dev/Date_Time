import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExp{
// Write a method getCurrentDateTime() that returns the current date and time as a LocalDateTime object. Also, print the date-time in the format yyyy-MM-dd HH:mm:ss.
  //  Write a method isDateTimeBefore(LocalDateTime dateTime1, LocalDateTime dateTime2) that takes two LocalDateTime objects and returns true if dateTime1 is before dateTime2, otherwise returns false.
public LocalDateTime getCurrenDateTime(){
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = dateTime.format(formatter);
    System.out.println(formattedDateTime);
    return dateTime;

}
public boolean isDateTimeBefore(LocalDateTime dateTime1){
    return dateTime1.isBefore(dateTime1);

}
public static void main(String[] args) {
    LocalDateTimeExp exp = new LocalDateTimeExp();  
    
    LocalDateTime DateTime = exp.getCurrenDateTime();

    boolean isBefore=exp.isDateTimeBefore(DateTime);
    System.out.println(isBefore);


    
}
}
