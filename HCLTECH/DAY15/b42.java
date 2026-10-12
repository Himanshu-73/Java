package DAY15;

import java.time.LocalTime;

public class b42 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        //For current time
        System.out.println(now.getHour());
        //For current minute
        System.out.println(now.getMinute());
        //For current second
        System.out.println(now.getSecond());
        //For current nano second
        System.out.println(now.getNano());

        LocalTime customTime = LocalTime.of(12,2,23);
        System.out.println(customTime);
        //For parsing time from string
        String timeString="15:30:45";
        LocalTime.parse(timeString);
        //For previous hour
        LocalTime pastTime =now.minusHours(1);
        System.out.println(pastTime);
    }
}
