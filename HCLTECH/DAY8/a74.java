package DAY8;

public class a74 {
    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName()+"="+element);
    }
    public static void main(String[] args) {
        genericDisplay(11);
        genericDisplay("HCL students");
        genericDisplay(1.0);
    }
}
