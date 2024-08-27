
// : Write a method addHoursToTime(LocalTime time, int hours) that takes a LocalTime object and an integer representing hours, and returns a new LocalTime with the specified number of hours added.
// Write a method compareTimes(LocalTime time1, LocalTime time2) that compares two LocalTime objects and returns:

import java.time.LocalTime;

public class LocalTimeExp {

    // Method to add a specified number of hours to a LocalTime object
    public LocalTime addHoursToTime(LocalTime time, int hours) {
        return time.plusHours(hours);
    }

    // Method to compare two LocalTime objects
    // Returns -1 if time1 is before time2, 1 if time1 is after time2, and 0 if they are equal
    public int compareTimes(LocalTime time1, LocalTime time2) {
        if (time1.isBefore(time2)) {
            return -1;
        } else if (time1.isAfter(time2)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        LocalTimeExp timeExp = new LocalTimeExp();
        
        // Example usage of addHoursToTime
        LocalTime initialTime = LocalTime.of(10, 30);  // 10:30 AM
        LocalTime newTime = timeExp.addHoursToTime(initialTime, 3);  // Add 3 hours
        System.out.println("Time after adding hours: " + newTime);  // Should print 13:30 or 1:30 PM
        
        // Example usage of compareTimes
        LocalTime time1 = LocalTime.of(10, 30);
        LocalTime time2 = LocalTime.of(13, 30);
        int comparisonResult = timeExp.compareTimes(time1, time2);
        if (comparisonResult == -1) {
            System.out.println("time1 is before time2");
        } else if (comparisonResult == 1) {
            System.out.println("time1 is after time2");
        } else {
            System.out.println("time1 and time2 are the same");
        }
    }
}
