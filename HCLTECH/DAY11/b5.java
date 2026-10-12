package DAY11;
//even or odd number
import java.util.*;
@FunctionalInterface 
interface evenodd{
    public void evenodd(int a);
} 

public class b5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        evenodd obj1=(a)->System.out.println((a%2==0)? a+" is even":a+" is odd");
        obj1.evenodd(input);
    }
}
