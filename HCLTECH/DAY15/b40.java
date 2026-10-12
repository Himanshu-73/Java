package DAY15;
import java.time.LocalDate;
public class b40 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now.getDayOfMonth();
        now.getDayOfWeek();
        now.getDayOfYear();
        System.out.println(now);
        //For Customized date
        LocalDate customDate = LocalDate.of(1989,04,24);
        System.out.println( customDate);
        //For current Date -process 02
        LocalDate today=LocalDate.now();
        System.out.println(today);
        //For yesterday
        LocalDate yesterday =today.minusDays(1);
        System.out.println(yesterday);
        LocalDate LastMonth =today.minusMonths(1);
        System.out.println(LastMonth);
        LocalDate LastYear= today.minusYears(1);
        System.out.println(LastYear);

    }    

}
