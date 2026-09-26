package DAY8;

import java.util.*;

public class a70 {
    public static void main(String[] args) {
        String[] arr1=new String[3];
        
        //System.out.println(arr[0]);

        ArrayList<Object> arr=new ArrayList<>();
        arr.add(114);
        arr.add("Rahul");
        arr.add(true);
        //arr.add(new Scanner(System.in));
        System.out.println(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.contains("Rahul"));
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());
        System.out.println(arr.getClass());

        arr1[0]=(String)arr.getFirst();
        System.out.println(arr1[0]);
        // arr1[0]=arr.getFirst().toString();
        // System.out.println(arr1[0]);
    }
}
