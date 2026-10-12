package DAY11;
//Lambda dor Addition - Use of two Parameters
@FunctionalInterface 
interface myAddition{
    public void addSum(int a ,int b);
}
public class b3 {
    public static void main(String[] args) {
        
        myAddition obj1=(a,b)->System.out.println(a+b);
        obj1.addSum(5,6);
        obj1.addSum(6,10);
    }   
}
