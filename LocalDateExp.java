import java.time.*;
public class LocalDateExp
{
// Create a method addDaysToCurrentDate(int days) that adds a specified number of days to the current date and returns the new date.
public LocalDate addDaysToCurrentDate(int days)
{
  LocalDate currentDate=LocalDate.now();
  System.out.println("Current Date => "+currentDate);
  return currentDate.plusDays(days);
}
// Create a method getFirstDayOfMonth(LocalDate date) that returns the first day of the month for a given date.
public LocalDate getFirstDayOfMonth(LocalDate date)
{
  return date.withDayOfMonth(1);
}
public static void main(String[] args) 
{
  //Get Current Date
  LocalDateExp aobj=new LocalDateExp();
  System.out.println("New Date => "+aobj.addDaysToCurrentDate(10));
  //The First Day Of Months =>
  LocalDate Dates=LocalDate.of(2024, 2, 25);
  System.out.println("The First Day of the Month => "+aobj.getFirstDayOfMonth(Dates));


}



}