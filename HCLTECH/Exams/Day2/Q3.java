package Exams.Day2;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        int num1; int num2; int num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number");
        num1=sc.nextInt();
        System.out.println("Enter second Number");
        num2=sc.nextInt();
        System.out.println("Enter Third Number");
        num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+"is greatest");
        }
        else if (num2>num3 && num2>num1) {
            System.out.println(num2+"is greatest");
        }
        else{
            System.out.println(num3+"is greatest");
        }  
        sc.close();
    }
}
