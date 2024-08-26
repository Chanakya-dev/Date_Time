import java.time.LocalTime;

public class LocalTimeExp{
// : Write a method addHoursToTime(LocalTime time, int hours) that takes a LocalTime object and an integer representing hours, and returns a new LocalTime with the specified number of hours added.
// Write a method compareTimes(LocalTime time1, LocalTime time2) that compares two LocalTime objects and returns:
public static void main(String[] args) {
     LocalTime time = LocalTime.of(10, 30); 
        LocalTime newTime = addHoursToTime(time, 3); 
        System.out.println("Time after adding 3 hours: " + newTime);
        LocalTime time1 = LocalTime.of(8, 15);
        LocalTime time2 = LocalTime.of(9, 45);
        int comparisonResult = compareTimes(time1, time2);
        if (comparisonResult == -1) {
            System.out.println("time1 is before time2");
        } else if (comparisonResult == 0) {
            System.out.println("time1 is equal to time2");
        } else {
            System.out.println("time1 is after time2");
        }
    }
    public static LocalTime addHoursToTime(LocalTime time, int hours) {
        return time.plusHours(hours);
    }
    public static int compareTimes(LocalTime time1, LocalTime time2) {
        return time1.compareTo(time2);
    }
}
