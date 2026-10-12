package DAY11;
//Max of two numbers
@FunctionalInterface 
interface maxtwo{
    public void maxtwo(int a ,int b);
}
public class b4 {
    public static void main(String[] args) {
        maxtwo obj1=(a,b)->System.out.println((a>b)? a:b);
        obj1.maxtwo(5,6);
    }
}
