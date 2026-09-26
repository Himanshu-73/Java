package Exams.Day6;

public class Q72 {
    public static void main(String args[]){
        try{
            int[] a= {1,2,3};
            System.out.println(a[5]);
            int b=5/0;
        }catch(ArrayIndexOutofBoundsException e){
            System.out.println("Out of bound");
        } catch(ArithmeticException e){
            System.out.println("Not divisible by 0");
        }
    }
}
