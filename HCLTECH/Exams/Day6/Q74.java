package Exams.Day6;

public class Q74 {
    public static void main(String[] args) {
            try{
            int a=120,b=1,c;
            c=a/b;
            System.out.println(c);
        } catch(Exception e){
            System.out.println(e);
        } finally{
            System.out.println("finally block");
        }
    }
}
