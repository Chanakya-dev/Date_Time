import java.time.DayOfWeek;
import java.time.LocalDate;
public class LocalDateExp{
// Create a method addDaysToCurrentDate(int days) that adds a specified number of days to the current date and returns the new date.
  // Create a method getFirstDayOfMonth(LocalDate date) that returns the first day of the month for a given date.
   static LocalDate addDaysToCurrentDate(int days){
      LocalDate today = LocalDate.now();
      LocalDate newDate = today.plusDays(days);
      return newDate;
    }

   static DayOfWeek getFirstDayOfMonth(LocalDate date){
      LocalDate firstDayOfMonth=date.withDayOfMonth(1);
      return firstDayOfMonth.getDayOfWeek();

    }

    public static void main(String[] args) {
      System.out.println(addDaysToCurrentDate(7));
      LocalDate date= LocalDate.of(2023,11,25);
      System.out.println(getFirstDayOfMonth(date));
    }
}
