package DAY5;
class superman{
    int calculation(int a, int b){
        return a+b;
    }
    int calculation(int a, int b, int c){
        return a+b+c;
    }
    double calculation(double a, double b){
        return a*b;
    }

}
public class a36 {
    public static void main(String[] args) {
        superman obj= new superman();
        System.out.println(obj.calculation(2,4));
        System.out.println(obj.calculation(10,20,30));
        System.out.println(obj.calculation(2.25,50.0));
    }
}
