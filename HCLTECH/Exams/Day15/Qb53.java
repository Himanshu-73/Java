package Exams.Day15;
//Meeting Time Zone convertor
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Qb53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Enter the meeting date and time in the format dd/MM/yyyy HH:mm for Asia/Kolkata timezone");
        String input=sc.nextLine();
        LocalDateTime meetingTime=LocalDateTime.parse(input,dtf);
        ZonedDateTime kolkataTime=ZonedDateTime.of(meetingTime,ZoneId.of("Asia/Kolkata"));
        ZonedDateTime utcTime=kolkataTime.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("Meeting time in UTC: " + utcTime.format(dtf));
        ZoneId newyorkZone=ZoneId.of("America/New_York");
        ZonedDateTime newyorkTime=utcTime.withZoneSameInstant(newyorkZone);
        System.out.println("Meeting time in New York: " + newyorkTime.format(dtf));
        sc.close();
    }
}
