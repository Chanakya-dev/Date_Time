import java.time.LocalTime;

public class LocalTimeExp{
// : Write a method addHoursToTime(LocalTime time, int hours) that takes a LocalTime object and an integer representing hours, and returns a new LocalTime with the specified number of hours added.
// Write a method compareTimes(LocalTime time1, LocalTime time2) that compares two LocalTime objects and returns:

public LocalTime addHoursToTime(LocalTime time, int hours){
    return time.plusHours(hours);
}
public int compareTimes(LocalTime time1, LocalTime time2){
    return time1.compareTo(time2);
}
public static void main(String[] args) {
    LocalTimeExp exp = new LocalTimeExp();
    LocalTime time1 = LocalTime.of(2, 30, 0);
    LocalTime time2 = LocalTime.of(3, 30, 0);
    LocalTime time3 = exp.addHoursToTime(time1, 5);
    int result = exp.compareTimes(time1, time2);
    System.out.println(time1);
    System.out.println(time2);
    System.out.println(time3);
    System.out.println(result);

    if(result == 0){
        System.out.println("The times are equal");
    }
    else if(result < 0){
        System.out.println("Time1 is earlier than Time2");
    }
    else{
        System.out.println("Time1 is later than Time2");
    }
    
}
}
