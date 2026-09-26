package DAY2;

import java.util.Scanner;

public class a8 {
    public static void main(String[] args) {
        System.out.println("Enter your Grade");
        int num=0;
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
        if(num>95){
            System.out.println("Your Grade is A");
        }
        else if(num> 85){
            System.out.println("Your Grade is B");
        }
        else{
            System.out.println("Your Grade is C");
        }
    }
}
