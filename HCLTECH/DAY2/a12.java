package DAY2;
import java.util.*;
public class a12 {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //     System.out.println("Number:" +i);
        // }
        int i;
        System.out.println("Enter the table you want to print");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();

        for(i=1;i<=10;i++){
            System.out.println(num+"*" + i +"=" + num*i);
        }
    }
}
