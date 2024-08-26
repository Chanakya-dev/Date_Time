import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeExp{
// : Write a method addHoursToTime(LocalTime time, int hours) that takes a LocalTime object and an integer representing hours, and returns a new LocalTime with the specified number of hours added.
// Write a method compareTimes(LocalTime time1, LocalTime time2) that compares two LocalTime objects and returns:
static LocalTime addHoursToTime(LocalTime time, int hours){
    LocalTime newTime=time.plusHours(hours);
    return newTime;
}

static Duration compareTimes(LocalTime time1, LocalTime time2){
    Duration dur=Duration.between(time1, time2);
    return dur;
}
public static void main(String[] args) {
    LocalTime time=LocalTime.of(13, 56, 34);
    System.out.println(addHoursToTime(time, 9));
    System.out.println(compareTimes(LocalTime.of(14, 45, 23), LocalTime.of(17, 23, 12)));
}
}
