import java.time.LocalTime;
public class LocalTimeExp{
    public LocalTime addHoursToTime(LocalTime time, int hours){
        return time.plusHours(hours);
    }
    public int compareTimes(LocalTime time1, LocalTime time2){
        return time1.compareTo(time2);
    }
    public static void main(String[] args) {
        LocalTimeExp lte = new LocalTimeExp();
        LocalTime time1 = LocalTime.of( 12, 30, 0);
        LocalTime time2 = LocalTime.of(14, 30, 0);
        LocalTime time3 = lte.addHoursToTime(time1, 7);
        System.out.println("added time: " + time3);
        int Result = lte.compareTimes(time1, time2);
        System.out.println("Time1: " + time1);
        System.out.println("Time2: " + time2);
        if(Result < 0){
            System.out.println("Time1 is before Time2");
        }
        else if(Result > 0){
            System.out.println("Time1 is after Time2");
        }
        else{
            System.out.println("Time1 is equal to Time2");
        }
        System.out.println("Comparison result: " + Result);
        
    }
// : Write a method addHoursToTime(LocalTime time, int hours) that takes a LocalTime object and an integer representing hours, and returns a new LocalTime with the specified number of hours added.
// Write a method compareTimes(LocalTime time1, LocalTime time2) that compares two LocalTime objects and returns:
}
