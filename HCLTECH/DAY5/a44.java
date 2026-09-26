package DAY5;

import java.util.Scanner;

abstract class TV{
    abstract void turnOn();
    abstract void turnOff();
}
class TVRemote extends TV{
    @Override
    void turnOn(){
        System.out.println("TV is turn ON");
    }
    @Override 
    void turnOff(){
        System.out.println("TV is turn OFF");
    }
}
public class a44 {
    public static void main(String[] args) {
        TVRemote obj = new TVRemote();
        obj.turnOn();
        obj.turnOff(); 
        System.out.println("Remote Menu:");
        while(true){
            Scanner sc = new Scanner(System.in);
            int a=sc.nextInt();
            System.out.println("Remote Menu:");
            System.out.println("Enter 1 to turn ON the TV");
            System.out.println("Enter 2 to turn OFF the TV");
            System.out.println("Enter 3 to exit");
            switch(a){
                case 1:
                    obj.turnOn();
                    break;
                case 2:
                    obj.turnOff();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
