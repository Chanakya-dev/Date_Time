import java.time.LocalDate;
public class LocalDateExp{

  public LocalDate addDaysToCurrentDate(int days){
    LocalDate date = LocalDate.now();
    return date.plusDays(days);
  }
  public LocalDate getFirstDayOfMonth(LocalDate date){
    return date.withDayOfMonth(1);
  }
  public static void main(String[] args) {
    LocalDateExp lde = new LocalDateExp();
    LocalDate date = lde.addDaysToCurrentDate(5);
    System.out.println("Current Date: " +date);
    LocalDate date1 = lde.getFirstDayOfMonth(date);
    System.out.println("First Day of the Month: " +date1);
  }
// Create a method addDaysToCurrentDate(int days) that adds a specified number of days to the current date and returns the new date.
  // Create a method getFirstDayOfMonth(LocalDate date) that returns the first day of the month for a given date.
}
