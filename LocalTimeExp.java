import java.time.LocalTime;

public class LocalTimeExp{
// : Write a method addHoursToTime(LocalTime time, int hours) that takes a LocalTime object and an integer representing hours, and returns a new LocalTime with the specified number of hours added.
// Write a method compareTimes(LocalTime time1, LocalTime time2) that compares two LocalTime objects and returns:

  public LocalTime addHoursToTime(LocalTime time, int hours) {
        LocalTime newTime = time.plusHours(hours);
        
        return newTime;
    }
    public String compareTimes(LocalTime time1, LocalTime time2) {
        // Compare the two times
        if (time1.isBefore(time2)) {
            return "time1 is before time2";
        } else if (time1.isAfter(time2)) {
            return "time1 is after time2";
        } else {
            return "time1 is equal to time2";
        }
    }

    public static void main(String[] args) {
        LocalTimeExp timeExp = new LocalTimeExp();

        LocalTime currentTime = LocalTime.of(10, 0);  // 10:00 AM
        LocalTime newTime = timeExp.addHoursToTime(currentTime, 3);  // Adding 3 hours
        System.out.println("New Time: " + newTime); 

        LocalTime time1 = LocalTime.of(9, 30);  
        LocalTime time2 = LocalTime.of(10, 30);  
        String comparisonResult = timeExp.compareTimes(time1, time2);
        System.out.println(comparisonResult); 

}
}
