package Exams.Day2;
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A");
        int a=sc.nextInt();
        System.out.println("Enter B");
        int b=sc.nextInt();
        // int temp=a;
        // a=b;
        // b=temp;
        // System.out.println("swap A:"+a+" B:"+b);
        a=a+b;
        b=b-a;
        a=a-b;
        System.out.println("swap A:"+a+" B:"+b);
    }
}
