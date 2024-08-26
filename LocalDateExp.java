import java.time.LocalDate;

public class LocalDateExp{
// Create a method addDaysToCurrentDate(int days) that adds a specified number of days to the current date and returns the new date.
  // Create a method getFirstDayOfMonth(LocalDate date) that returns the first day of the month for a given date.
public LocalDate addDaysToCurrentDate(int days) {
    LocalDate currentDate = LocalDate.now();
    return currentDate.plusDays(days);
}
public LocalDate getFirstDayOfMonth(LocalDate date) {
    return date.withDayOfMonth(1);  // returns the first day of the month     

}

public static void main(String[] args) {
    LocalDateExp exp = new LocalDateExp();
    LocalDate currentDate = LocalDate.now();
    LocalDate newDate = exp.addDaysToCurrentDate(5);
    LocalDate firstDayOfMonth = exp.getFirstDayOfMonth(currentDate);
    System.out.println("Current Date: " + currentDate);
    System.out.println("New Date: " + newDate);
    System.out.println("First Day of the Month: " + firstDayOfMonth);
}


}
