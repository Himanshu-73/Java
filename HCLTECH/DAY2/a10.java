package DAY2;
import java.util.Scanner;
public class a10 {
    public static void main(String[] args) {
        int age;
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter age to check if you are eligible or not");
            age=sc.nextInt();
            if(age>16 && age<60){
                System.out.println("You are eligible");
            }
            else{
                System.out.println("You are not eligible");
            }
        }
    }
}
