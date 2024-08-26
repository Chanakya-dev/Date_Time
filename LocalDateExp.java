import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
public class LocalDateExp{
// Create a method addDaysToCurrentDate(int days) that adds a specified number of days to the current date and returns the new date.
  // Create a method getFirstDayOfMonth(LocalDate date) that returns the first day of the month for a given date.
    public LocalDate addDaysToCurrentDate(int days) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.plusDays(days);
    }

    public LocalDate getFirstDayOfMonth(LocalDate date) {
        return date.with(TemporalAdjusters.firstDayOfMonth());
    }

    public static void main(String[] args) {
        LocalDateExp dateExp = new LocalDateExp();

        LocalDate newDate = dateExp.addDaysToCurrentDate(10);
        System.out.println("Date after adding 10 days: " + newDate);

        LocalDate firstDayOfMonth = dateExp.getFirstDayOfMonth(newDate);
        System.out.println("First day of the month: " + firstDayOfMonth);
    }
}


