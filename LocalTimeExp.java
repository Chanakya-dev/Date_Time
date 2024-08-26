import java.time.LocalTime;

public class LocalTimeExp{
// : Write a method addHoursToTime(LocalTime time, int hours) that takes a LocalTime object and an integer representing hours, and returns a new LocalTime with the specified number of hours added.
public LocalTime AddHoursToTime(LocalTime time,int hours)
{
    return time.plusHours(hours);

}
// Write a method compareTimes(LocalTime time1, LocalTime time2) that compares two LocalTime objects and returns:
public int compareTimes(LocalTime time1, LocalTime time2)
{
    return time1.compareTo(time2);
}
public static void main(String[] args) 
{
  LocalTimeExp aobj1=new LocalTimeExp();

  LocalTime time=LocalTime.of(10, 30);
  System.out.println("Current Time => "+time);
  LocalTime newTime=aobj1.AddHoursToTime(time, 10);
  System.out.println("New Time => "+newTime);


  // for method 2
  LocalTime time1=LocalTime.of(10,  20);
  System.out.println("Time1 => "+time1);
  LocalTime time2=LocalTime.of(20,  10);
  System.out.println("Time2 => "+time2);
  int CompareResult=aobj1.compareTimes(time1, time2);
  System.out.println("Comppare Result => "+CompareResult);
  
  
  if(CompareResult<0)
  {
    System.out.println("Time1 is before than Time2");
  }
  else if(CompareResult==0)
  {
    System.out.println("Time Is Same");
  }
  else
  {
    System.out.println("Time1 is Afte Time2");
  }
  

}
}