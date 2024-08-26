import  java.time.LocalDate;
public class LocalDateExp{
// Create a method addDaysToCurrentDate(int days) that adds a specified number of days to the current date and returns the new date.
  // Create a method getFirstDayOfMonth(LocalDate date) that returns the first day of the month for a given date.
public static void main(String[] args) {
LocalDate date = LocalDate.now();
System.out.println("Current date: " + date);
LocalDate newDate = date.plusDays(10);
System.out.println("Date after adding 10 days: " + newDate);
LocalDate firstDayOfMonth = date.withDayOfMonth(1);
System.out.println("First day of the month: " + firstDayOfMonth);


}
}
