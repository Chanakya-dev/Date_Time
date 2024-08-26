import java.time.LocalTime;

public class LocalTimeExp{
// : Write a method addHoursToTime(LocalTime time, int hours) that takes a LocalTime object and an integer representing hours, and returns a new LocalTime with the specified number of hours added.
// Write a method compareTimes(LocalTime time1, LocalTime time2) that compares two LocalTime objects and returns:
 public LocalTime addHoursToTime(LocalTime time, int hours) {
        return time.plusHours(hours);
    }

    public int compareTimes(LocalTime t1, LocalTime t2) {
        return t1.compareTo(t2);
    }


public static void main(String[] args) {
        LocalTimeExp l1 = new LocalTimeExp();
        
        LocalTime time = LocalTime.of(10,30);
        LocalTime newTime = l1.addHoursToTime(time, 4);
        System.out.println("New Time: " + newTime);
        
        LocalTime time1 = LocalTime.of(8, 30);
        LocalTime time2 = LocalTime.of(8, 50);
        int comparison = l1.compareTimes(time1, time2);
        System.out.println("Comparison: " + comparison);
    }

}
