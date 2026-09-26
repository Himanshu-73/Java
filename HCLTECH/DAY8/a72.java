package DAY8;
//Generics calss with <>
class Test<T>{
    T var;
    Test(T var){
        this.var=var;  //Generic class as Constructor
    }
    public void display(){
        System.out.println(var);
    }
}
public class a72{
    public static void main(String[] args) {
        Test<Integer> iobj= new Test<>(10);
        iobj.display();
        Test<String> sobj= new Test<>("HI");
        iobj.display();
    }
}
