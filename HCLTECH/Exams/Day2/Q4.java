package Exams.Day2;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
        sc.close();
    }
}
