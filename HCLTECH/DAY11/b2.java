package DAY11;
//Lambda with string
interface nameHCL{
    public void name(String name);
}
public class b2 {
    public static void main(String[] args) {
        nameHCL obj=(name)->System.out.println("Welcome"+name);
        obj.name(" Himanshu");
    }
    
}
