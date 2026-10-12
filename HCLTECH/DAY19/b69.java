package DAY19;
//final variables name and age cannot be reassigned, but college is a reference to a class object
//whose attributes (name and address) can be modified. Therefore, we can change the college name through the student reference,
//but we cannot assign a different object to the final college reference.
public class b69 {
    public static void main(String[] args){
        College college=new College("Poornima","Sitapura");
        Student s1=new Student(26,"Himanshu",college);
        //s1.showCollege().name="JECRC University";  // This will not change the college name in Student class
        System.out.println(s1.showName()+"'s age is "+ s1.showAge() + "& his college is "+s1.showCollege().name);
        System.out.println("& address is "+s1.showCollege().address);  
    }
}

final class Student{
    private final int age;   // Immutable data type declaration
    private final String name;  // Immutable data type declaration
    private final College college;

    //Declaration of constructor
    //Defensive copy
    Student(int age, String name, College college){
        this.age = age;
        this.name = name;
        //this.college = college;  -> shallow copy
        this.college = new College(college.name, college.address);
    }
    //Getter
    public int showAge(){
        return this.age;
    }
    //Getter
    public String showName(){
        return this.name;
    }
    //Getter
    public College showCollege(){
        return new College(this.college.name, this.college.address);  // Returning a new College object to prevent external modification
    }
}
// Making this to change the datatype to class College data type
class College{
    String name;
    String address;
    College(String name, String address){
        this.name=name;
        this.address=address;
    }
}


/*Why did the change work?
- final College college prevents reassignment of the reference after initialization.
- It does not prevent modification of the referenced object's fields.
- c1 and s1.college point to the same object, so the change is visible through both references 

A defensive copy creates a separate object so that changes to the original object do not affect the student's stored college.*/