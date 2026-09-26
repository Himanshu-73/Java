package DAY6;

public class a51 {
    public static void main(String[] args) {
            try{
            int a=120,b=1,c;
            c=a/b;
            System.out.println(c);
        } catch(Exception e){
            System.out.println(e);
        } finally{
            System.out.println("I am in finally block");
        }
    }
}
