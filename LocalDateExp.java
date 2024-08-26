import java.time.LocalDate;

public class LocalDateExp{
// Create a method addDaysToCurrentDate(int days) that adds a specified number of days to the current date and returns the new date.
  // Create a method getFirstDayOfMonth(LocalDate date) that returns the first day of the month for a given date.

public LocalDate addDaysToCurrentDate(int days){
  LocalDate currentDate = LocalDate.now();
  return currentDate.plusDays(days);

}
public LocalDate getFirstDayOfMonth(LocalDate date){
  LocalDate FirstDayOfMonth = date.withDayOfMonth(2);
  return FirstDayOfMonth;

}
public static void main(String[] args) {
  LocalDateExp Date = new LocalDateExp();
  LocalDate newDate = Date.addDaysToCurrentDate(6);
  System.out.println("Date afte ^ days is  : " + newDate);
  LocalDate firstDayOfMonth = Date.getFirstDayOfMonth(LocalDate.of(2024, 3, 24));
  System.out.println("First day of month :" + firstDayOfMonth);
}
}
