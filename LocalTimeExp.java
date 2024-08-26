import java.time.LocalTime;
public class LocalTimeExp{
// : Write a method addHoursToTime(LocalTime time, int hours) that takes a LocalTime object and an integer representing hours, and returns a new LocalTime with the specified number of hours added.
// Write a method compareTimes(LocalTime time1, LocalTime time2) that compares two LocalTime objects and returns:


    public LocalTime addHoursToTime(LocalTime time, int hours) {
        return time.plusHours(hours);
    }

    public int compareTimes(LocalTime time1, LocalTime time2) {
        return time1.compareTo(time2);
    }

    public static void main(String[] args) {
        LocalTimeExp timeExp = new LocalTimeExp();

        LocalTime currentTime = LocalTime.now();
        System.out.println("Time after adding 5 hours: " + timeExp.addHoursToTime(currentTime, 5));

        LocalTime time1 = LocalTime.of(10, 30);
        LocalTime time2 = LocalTime.of(14, 45);
        System.out.println("Comparison result: " + timeExp.compareTimes(time1, time2));
    }
}
