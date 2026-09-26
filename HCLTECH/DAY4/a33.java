package DAY4;
//super keywrod id used to refer to immediate parent class method.
class Parent1{
    void fop(){
        System.out.println("Parent Class");
    }
}
class child1 extends Parent1{
    void foc(){
        super.fop();  //By default provides super keyword
        System.out.println("Child class executed");
    }
}
public class a33 {
    public static void main(String[] args) {
        child1 obj=new child1();
        obj.foc();
    }
}

//Question can copy constructor be used with super keyword if yes why?
