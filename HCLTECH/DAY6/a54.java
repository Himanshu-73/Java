package DAY6;
//throw keyword
public class a54 {
    public static void main(String[] args) {
        int age=15;
        if(age<18){
            throw new ArithmeticException("Age must be 18 or above");
        }
        System.out.println("Eligible");
    }
}
