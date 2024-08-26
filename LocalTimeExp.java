import java.time.LocalTime;
public class LocalTimeExp{
// : Write a method addHoursToTime(LocalTime time, int hours) that takes a LocalTime object and an integer representing hours, and returns a new LocalTime with the specified number of hours added.
// Write a method compareTimes(LocalTime time1, LocalTime time2) that compares two LocalTime objects and returns:

public static void main(String[] args) {
LocalTime time = LocalTime.now();
System.out.println("Current time: " + time);
LocalTime newTime = time.plusHours(2);
System.out.println("Time after adding 2 hours: " + newTime);
LocalTime time1 = LocalTime.of(10, 0);
LocalTime time2 = LocalTime.of(12, 0);
boolean result = time1.isBefore(time2);
System.out.println("Is time1 before time2? " + result);
}}
