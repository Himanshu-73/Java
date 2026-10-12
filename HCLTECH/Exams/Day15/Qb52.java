package Exams.Day15;
import java.time.*;
import java.util.*;
public class Qb52 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Exam Days Calculator");
        System.out.println("Enter your exam date in the format YYYY-MM-DD");
        String dateInput= sc.nextLine();
        LocalDate exam= LocalDate.parse(dateInput);
        System.out.println("Exam is on "+exam.getDayOfWeek());
        LocalDate today= LocalDate.now();
        Period timeremain=Period.between(today,exam);
        System.out.println("Remaining time: " + timeremain.getYears() + " Years " + timeremain.getMonths() + " Months " + timeremain.getDays() + " Days");
        if (exam.isLeapYear()) {
            System.out.println("Exam year is a leap year.");
        } else {
            System.out.println("Exam year is not a leap year.");
        }
    }

}
