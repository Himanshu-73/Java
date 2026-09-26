package Day6;
//try-Catch
public class Q71{
    public static void main(String[] args){
        try{
            int a=5,b=0,c;
            c=a/b;
        } catch(Exception e){
            System.out.println(e);
        } finally{
            System.out.println("print finally")
        }
    }
}