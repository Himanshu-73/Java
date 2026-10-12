package DAY15;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class b46 {
    public static void main(String[] args) {
        String Date="05/10/2026";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(LocalDate.now()));
        // LocalDate parse =LocalDate.parse(Date, dtf);
        // System.out.println(parse);
    }
    
}
