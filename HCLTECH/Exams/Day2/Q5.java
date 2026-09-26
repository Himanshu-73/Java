package Exams.Day2;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter any year:");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("not a leap year");
        }
        sc.close();
    }
}
