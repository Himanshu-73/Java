package DAY5;
interface first{
    public void display();
}
interface second{
    public void display2();
}
class demo implements first,second{
    @Override 
    public void display(){
        System.out.println("First interface");
    }
    @Override 
    public void display2(){
        System.out.println("Second interface");
    }
}
public class a43 {
    public static void main(String[] args) {
        demo d = new demo();
        d.display();
        d.display2();
    }
}
