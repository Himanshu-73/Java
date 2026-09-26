package DAY6;
//Array Index out of bound
//Use of multiple catch
public class a52 {
    public static void main(String[] args) {
        try {
            int[] numbers={1,2,3};
            System.out.println(numbers[10]);
            int result=10/0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index does not exist");
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }catch(Exception e){
            System.out.println("Something else went wrong");
        }
    }
}
