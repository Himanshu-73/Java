package Exams.Day15;
import java.time.*;
import java.util.*;

public class Qb54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Emplyee Age Calculator: ");
        System.out.println("Enter Employee Date of Birth in YYYY-MM-DD format: ");
        LocalDate dobInput = LocalDate.parse(sc.nextLine());
        LocalDate today = LocalDate.now();
        Period age = Period.between(dobInput, today);
        System.out.println("Employee Age: " + age.getYears() + " Years " + age.getMonths() + " Months " + age.getDays() + " Days");
    }
}
