package Exams.Day6;

public class Q73 {
    public static void main(String[] args){
        try{
            int a=5,b=0,c;
            c=a/b;
            System.out.println(c);
        } catch(Exception e){
            System.out.println(e);
        } finally{
            System.out.println("Finally Block");
        }
    }
}
