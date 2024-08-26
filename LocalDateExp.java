import java.time.LocalDate;

public class LocalDateExp{
// Create a method addDaysToCurrentDate(int days) that adds a specified number of days to the current date and returns the new date.
  // Create a method getFirstDayOfMonth(LocalDate date) that returns the first day of the month for a given date.
  public LocalDate addDaysToCurrentDate(int days){
    LocalDate currentDate = LocalDate.now();
    return currentDate.plusDays(days);
  }
  public LocalDate getFirstDayOfMonth(LocalDate date){
   return LocalDate.of(date.getYear(), date.getMonth(), 1); 
  }
  public static void main(String args[]){
    LocalDateExp lDate = new LocalDateExp();
    LocalDate newDate=lDate.addDaysToCurrentDate(7);
    System.out.println("Date after adding 7 days: " + newDate);
    LocalDate firstDayOfMonth=lDate.getFirstDayOfMonth(LocalDate.now());
    System.out.println("First day of the current month: " + firstDayOfMonth);
  }
}

