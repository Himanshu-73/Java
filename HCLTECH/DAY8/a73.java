package DAY8;
// Generics class with multiple variables
class Practise<P,U>{
    P var;
    U var1;

    Practise(P var, U var1) {
        this.var=var;
        this.var1=var1;
    }
    public void display(){
        System.out.println(var+" "+var1);
        //System.out.println(var1);
    }
}
public class a73 {
    public static void main(String[] args) {
        Practise<Integer,String> obj=new Practise(100,"HELLO");
        obj.display();
    }
}


