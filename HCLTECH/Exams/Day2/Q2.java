package Exams.Day2;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number");
        int num1=sc.nextInt();
        System.out.println("Enter second Number");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(num1+"is greater");
        }
        else if (num2>num1){
            System.out.println(num2+"is greater");
        }  
        else{
            System.out.println("Both are equal");
        }
        sc.close();
    }
}
