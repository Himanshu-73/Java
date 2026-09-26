package Exams.Day7;
import java.util.*;
public class Q91 {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        for(String lst:list){
            System.out.println(lst);
        }
        list.add("Z");
        list.set(1,"H");
        list.remove("H");
        System.out.println(list);
    }
}
