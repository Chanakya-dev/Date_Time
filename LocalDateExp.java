import java.time.LocalDate;

public class LocalDateExp{
// Create a method addDaysToCurrentDate(int days) that adds a specified number of days to the current date and returns the new date.
  // Create a method getFirstDayOfMonth(LocalDate date) that returns the first day of the month for a given date.
  public LocalDate addDaysToCurrentDate (int days){
    LocalDate currentDate = LocalDate.now();
    LocalDate newDate = currentDate.plusDays(days);
    return newDate;
  }
    public LocalDate getFirstDayofMonth(LocalDate date){
      LocalDate FirstDayOfMonth= date.withDayOfMonth(1);
      return FirstDayOfMonth;
        }  

        public static void main(String[] args) {
          LocalDateExp date = new LocalDateExp();
          LocalDate newDate = date.addDaysToCurrentDate(10);
          System.out.println("Date after 10 days: " + newDate);
  
          LocalDate firstDay = date.getFirstDayofMonth(LocalDate.of(2024, 8, 26));
          System.out.println("First day of the month: " + firstDay);
        }
}
