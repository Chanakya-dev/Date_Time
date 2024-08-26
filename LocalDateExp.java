import java.time.LocalDate;

public class LocalDateExp{
// Create a method addDaysToCurrentDate(int days) that adds a specified number of days to the current date and returns the new date.
  // Create a method getFirstDayOfMonth(LocalDate date) that returns the first day of the month for a given date.
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
  
  LocalDate newDate = addDaysToCurrentDate(10);
        System.out.println("Date after adding 10 days: " + newDate);
        LocalDate firstDay = getFirstDayOfMonth(today);
        System.out.println("First day of the current month: " + firstDay);
  }
    
  public static LocalDate addDaysToCurrentDate(int days) {
    LocalDate today = LocalDate.now();
    return today.plusDays(days);
}
public static LocalDate getFirstDayOfMonth(LocalDate date) {
  return date.withDayOfMonth(1);
}
}

