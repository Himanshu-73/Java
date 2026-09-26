package Exams.Day2;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter a number whose table you want to print");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(input + " * " + (i+1) + " = " + (input * (i+1)));
        }
        sc.close();
    }
}
