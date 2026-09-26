public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("A");

            int x = 10 / 0;

            System.out.println("B");
        }
        catch (ArithmeticException e) {
            System.out.println("C");
        }

        System.out.println("D");
    }
}
//Good question

try {
    int x = 10 / 0;
}
catch (Exception e) {
    System.out.println("Exception");
}
catch (ArithmeticException e) {
    System.out.println("Arithmetic");
}
