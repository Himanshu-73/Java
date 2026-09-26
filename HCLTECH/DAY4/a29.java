package DAY4;
//this with parent class constructor
public class a29 {
    a29(){
        this(41);
        System.out.println("Constructor 1 Initalized");
    }
    a29(int r){
        this("Himanshu");
        System.out.println("Constructor 2 Initialized"+r);
    }
    a29(String s){
        System.out.println("Constructor 3 Initiated"+s);
    }
    public static void main(String[] args) {
        a29 obj=new a29();
        System.out.println("Main method");
    }
}
