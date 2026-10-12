package DAY18;
import java.util.*;

public class b53 {
    public static void main(String[] args) {
        var name="Himanshu";
        var age=21;
        var salary = 8899.1010;
        var names=new ArrayList<String>(List.of("Himanshu","Raj","Mohit"));
        //var age= "Shyam"; -> creates compilation error
        //public var num=23; -> can't be used with access modifiers
        //var con =(num)->{}; -> can't be initalized with lambda expression
        //var myarray={1,2,3,4,5} -> can't be initalized with array initializer
        //var num1=null;  -> since null is not a type, it can't be used to declare  

        System.out.println(name);
        System.out.println(salary);
        System.out.println(age);
        System.out.println(names);
        System.out.println(name.getClass());
    }
}
