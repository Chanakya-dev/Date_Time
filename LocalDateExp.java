
// Create a method addDaysToCurrentDate(int days) that adds a specified number of days to the current date and returns the new date.
  // Create a method getFirstDayOfMonth(LocalDate date) that returns the first day of the month for a given date.
  import java.time.LocalDate;

public class LocalDateExp {

    // Method to add a specified number of days to the current date and return the new date
    public LocalDate addDaysToCurrentDate(int days) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.plusDays(days);
    }

    // Method to return the first day of the month for a given date
    public LocalDate getFirstDayOfMonth(LocalDate date) {
        return date.withDayOfMonth(1);
    }

    public static void main(String[] args) {
        LocalDateExp dateExp = new LocalDateExp();
        
        // Example usage of addDaysToCurrentDate
        int daysToAdd = 10;
        LocalDate newDate = dateExp.addDaysToCurrentDate(daysToAdd);
        System.out.println("New Date after adding " + daysToAdd + " days: " + newDate);

        // Example usage of getFirstDayOfMonth
        LocalDate someDate = LocalDate.of(2024, 8, 27);
        LocalDate firstDayOfMonth = dateExp.getFirstDayOfMonth(someDate);
        System.out.println("First day of the month: " + firstDayOfMonth);
    }
}



