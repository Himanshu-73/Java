package Exams.Day7;

import java.util.*;

public class Q92 {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(75);
        marks.add(92);
        marks.add(78);
        int total=0;
        for(int m:marks){
            total=total+m;
        }
        int avg= total/marks.size();
        System.out.println("Marks"+marks);
        System.out.println("Total:"+total+"Average"+avg);
        System.out.println("Highest"+Collection.max(marks)+"Lowest"+Collection.min(marks));

    }
    
}
