package DAY18;
//Records can implement interfaces
interface Printable{ 
    void print();
}
record Student(int id, String name) implements Printable{
    @Override
    public void print(){
        System.out.println(id+ " "+ name);
    }
}
public class b65 {
    public static void main(String[] args) {
        Student s=new Student(101,"Himanshu");
        s.print();
    }
}
