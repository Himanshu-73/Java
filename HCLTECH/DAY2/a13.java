package DAY2;
import java.util.*;
public class a13 {
    public static void main(String[] args) {
        int no =2;
        System.out.println("Enter a number for which less than even no. are print");
        Scanner sc= new Scanner(System.in);
        no=sc.nextInt();
        sc.close();
        int i=2;
        while(i<=no){
            System.out.println("The Even no. are" + i);
            i=i+2;
        }
    }
}
