package Exams.Day16;

import java.util.Scanner;
import java.util.concurrent.*;

sealed class AnnualSalaryTask implements Callable<Double> permits SpecialSalaryTask{
    private final double monthlySalary;
    private final int[] workingDaysPerMonth;
    private final int[] monthlyLeaves;
    private final String CompanyName = "HCLTECH";

    public AnnualSalaryTask(double monthlySalary, int[] workingDaysPerMonth, int[] monthlyLeaves) {
        this.monthlySalary = monthlySalary;
        this.workingDaysPerMonth = workingDaysPerMonth;
        this.monthlyLeaves = monthlyLeaves;
    }
    @Override
    public Double call() {
        double totalAnnualIncome = 0;
        
        for (int i = 0; i < 12; i++) {
            if (workingDaysPerMonth[i] > 0) {
                double dailyRate = monthlySalary / workingDaysPerMonth[i];
                int effectiveDays = Math.max(0, workingDaysPerMonth[i] - monthlyLeaves[i]);
                totalAnnualIncome += dailyRate * effectiveDays ;
            }
        }
        
        return totalAnnualIncome;
    }
}

final class SpecialSalaryTask extends AnnualSalaryTask {
    public SpecialSalaryTask(double monthlySalary, int[] workingDaysPerMonth, int[] monthlyLeaves) {
        super(monthlySalary, workingDaysPerMonth, monthlyLeaves);
        int bonus=1000; // Example bonus for special salary task and if there is no leave then give bonus of 1000
        if (monthlyLeaves.length == 0) {
            bonus = 1000;
        }
    }
}
public class Qb66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double monthlySalary = sc.nextDouble();

        int[] workingDaysPerMonth = new int[12];
        int[] monthlyLeaves = new int[12];
        String[] months = {"January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};

        System.out.println("\nEnter working days and leaves for each month:");
        for (int i = 0; i < 12; i++) {
            System.out.println("--- " + months[i] + " ---");
            System.out.print("Working days: ");
            workingDaysPerMonth[i] = sc.nextInt();
            System.out.print("Leaves taken: ");
            monthlyLeaves[i] = sc.nextInt();
        }

        sc.close();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Double> task = new AnnualSalaryTask(monthlySalary, workingDaysPerMonth, monthlyLeaves);
        Future<Double> future = executor.submit(task);

        try {
            double totalAnnualIncome = future.get();
            System.out.printf("\nTotal Annual Income: ₹%.2f\n", totalAnnualIncome);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}