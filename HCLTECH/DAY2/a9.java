package DAY2;
import java.util.*;
public class a9 {
    public static void main(String[] args) {
        int day;
    try(Scanner sc=new Scanner(System.in)){
            System.out.println("selected no. correspons to date");
            day=sc.nextInt();

    };
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println(("tuesday"));
                break;
            default:
                System.out.println("Welcome to calendar");
        }
    }
}
