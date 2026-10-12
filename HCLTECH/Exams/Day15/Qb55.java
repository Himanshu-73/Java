package Exams.Day15;
import java.time.*;
import java.util.*;
public class Qb55 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Duration of Training");
        System.out.println("Enter Training Start Date in YYYY-MM-DD format: ");
        LocalDate startDate= LocalDate.parse(sc.nextLine());
        System.out.println("Enter Training End Date in YYYY-MM-DD format: ");
        LocalDate endDate= LocalDate.parse(sc.nextLine());
        Period duration= Period.between(startDate,endDate);
        System.out.println("Training Duration: " + duration.getYears() + " Years " + duration.getMonths() + " Months " + duration.getDays() + " Days");
    }
}
