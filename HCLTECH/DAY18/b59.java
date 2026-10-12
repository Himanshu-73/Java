package DAY18;
//yield with switch case
//yield is used to return a value from a switch expression. It allows you to specify the value that should be returned for a particular case in the switch statement. 
// This is useful when you want to return a value based on the input provided to the switch statement.
//It is diff from simple switch case as it allows you to return a value from a switch expression,
//  whereas a simple switch statement does not return a value.

//No {} braces = No yield (Java implicitly returns the expression).
//With {} braces = Must use yield to return the value.
import java.util.*;
public class b59 {
    public static void main(String[] args) {
        System.out.println("Enter day number (1-7):");
        Scanner sc= new Scanner(System.in);
        int day=sc.nextInt();
        String result=switch(day){
            case 1,2,3,4,5->{
                yield "Weekday";
            }
            case 6,7->{
                yield "Weekend";
            }
            default->{
                yield "Invalid day";
            }
        };
        System.out.println(result);
    }
}
