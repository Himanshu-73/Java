package Exams.Day14;
import java.util.*;
class Emp{
    String name;
    int salary;
    public Emp(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
}
public class Qb41 {
    public static void main(String[] args) {
        List<String> empname= Arrays.asList("Rahul","Amit","Neha");
        List<Integer> empsalary= Arrays.asList(25000,30000,40000);
        List<Emp> employees= new ArrayList<>();
        for(int i=0;i<empname.size();i++){
            employees.add(new Emp(empname.get(i),empsalary.get(i)));
        }
        employees.stream().filter(x->x.salary>25000).map(x->x.name).forEach(System.out::println);

    }
}
