package DAY8;


public class a75 {
    public static <T extends Comparable<T>> T findMax(T A,T B){
        if(A.compareTo(B)>0){
            return A;
        }else{
            return B;
        }
    }
    public static void main(String[] args) {
        System.out.println(findMax(11,12));
        System.out.println(findMax("HIM","NSH"));
    }
}
