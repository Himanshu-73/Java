package Exams.Day3;

class BankAccount{
    int accNumber;
    String accName;
    double balance;
    

    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited"+amount);
        }else{
            System.out.println("Invalid amount");
        }
    }
    void withdraw(double amount){
        if(amount >0 && amount<=balance){
            balance-=amount;
            System.out.println("withdrawn:"+amount);
        }else{
            System.out.println("Insufficent balance");
        }
    }
    void display(){
        System.out.println("Name:" + accName);
        System.out.println("Balance:"+ balance);
    }
}

public class Q28 {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount();
        acc.accName="Himanshu";
        acc.accNumber=123321;
        acc.balance=5000.0;
        acc.display(); 
        acc.deposit(2000);
        acc.withdraw(100);
        acc.display();
    }
    
}
