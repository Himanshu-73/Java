package Exams.Day15;
import java.time.*;
import java.util.*;
public class Qb51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        ArrayList<LocalDate> joiningDate=new ArrayList<>();
        names.add("John");
        joiningDate.add(LocalDate.of(2005,1,10));
        names.add("Johnny");
        joiningDate.add(LocalDate.of(2004,9,30));
        names.add("Janardhan");
        joiningDate.add(LocalDate.of(2005,11,1));
        System.out.println("Total duration of Employee working in the company");
        for (int i = 0; i < names.size(); i++) {
            LocalDate joining = joiningDate.get(i);
            LocalDate today = LocalDate.now();
            Period duration = Period.between(joining, today);
            System.out.println("Employee: " + names.get(i));
            System.out.println("Total Time worked: " + duration.getYears() + " years "
                    + duration.getMonths() + " Months " + duration.getDays() + " Days");
        }

    }

}
