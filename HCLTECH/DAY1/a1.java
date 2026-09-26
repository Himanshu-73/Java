package DAY1;
import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        System.out.println("Hello ");
        //var declaration
        int a, b, c, e;
        try(Scanner sc =new Scanner(System.in)){
            a=sc.nextInt();
            System.out.println("Enter the value of b");
            b=sc.nextInt();
        }
        c= a + b;
        e= a - b;
        System.out.println("SUM is:" + c);
        System.out.println("The sub value is " + e);
        //dynamic value intake
        int d=a*b;
        System.out.println("The multi value is " +d);
        System.out.println("The div value is " + a/b);
        System.out.println("The mod value is " + a%b);
        System.out.println("The value of a is " + a);
    }   
    
}
