import java.time.LocalTime;

public class LocalTimeExp{
// : Write a method addHoursToTime(LocalTime time, int hours) that takes a LocalTime object and an integer representing hours, and returns a new LocalTime with the specified number of hours added.
// Write a method compareTimes(LocalTime time1, LocalTime time2) that compares two LocalTime objects and returns:
public LocalTime addHoursToTime(LocalTime time, int hours) {
        return time.plusHours(hours);
    }
    public int compareTimes(LocalTime time1, LocalTime time2) {
        if (time1.isBefore(time2)) {
            return -1;
        } else if (time1.equals(time2)) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        LocalTimeExp localTimeExp = new LocalTimeExp();
        LocalTime time1 = LocalTime.of(10, 30);
        LocalTime time2 = LocalTime.of(12, 45);
        LocalTime newTime = localTimeExp.addHoursToTime(time1, 3);
        System.out.println("New time after adding hours: " + newTime);
        int comparisonResult = localTimeExp.compareTimes(time1, time2);
        if (comparisonResult == -1) {
            System.out.println("time1 is before time2");
        } else if (comparisonResult == 0) {
            System.out.println("time1 is equal to time2");
        } else {
            System.out.println("time1 is after time2");
        }
    }

}