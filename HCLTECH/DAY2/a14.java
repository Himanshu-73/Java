package DAY2;
import java.util.Scanner;
public class a14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter a positive no.");
            n=sc.nextInt();
        } while(n<0);
        System.out.println("You enterd a valid +ve no.");
        sc.close();
    }
}
