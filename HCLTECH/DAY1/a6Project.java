package DAY1;
import java.util.Scanner;
public class a6Project {
    public static void main(String[] args) {
        int balance = 1500;
        int deposit, withdraw;
        int choice;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter your choice");
            System.out.println("Press 1 for balance");
            System.out.println("Press 2 for deposit");
            System.out.println("Press 3 for withdraw");
            System.out.println("Press 4 for exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your current balance is:" + balance);
                    break;
                case 2:
                    System.out.println("Enter your deposit amount:");
                    deposit=sc.nextInt();
                    break;
                case 3:
                    System.out.println("Enter withdraw amount:");
                    withdraw=sc.nextInt();
                    if(balance>withdraw && withdraw >0){
                        balance=balance - withdraw;
                        System.out.println("Your curretn balance is " + balance);
                    }
                    else{
                        System.out.println("Enter correct denomination");
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
            }
        } while(choice!=4);
        sc.close();
    }
}
