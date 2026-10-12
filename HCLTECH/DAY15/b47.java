package DAY15;
import java.time.LocalDate;
import java.time.Period;
public class b47 {
 public static void main(String[] args) {
    //Date of Birth
    LocalDate dob = LocalDate.of(2000, 01, 01);
    //Current date
    LocalDate today = LocalDate.now();

    Period age = Period.between(dob, today);
    System.out.println("Date of Birth: " + dob);
    System.out.println("Current Date: " + today);

    System.out.println("\nAge");
    System.out.println("Years: " + age.getYears());
    System.out.println("Months: " + age.getMonths());
    System.out.println("Days: " + age.getDays());
    System.out.println("\nMy Age: " + age.getYears() 
    + " Years, " + age.getMonths() + 
    " Months, " + age.getDays() + 
    " Days");

 }   
}
