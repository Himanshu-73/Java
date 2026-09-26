package DAY4;

public class a27 {
    int rollNo;
    String name;
    
    a27(int rollNo, String name){
        // rollNo=rollNo;
        // name=name;   //will return null and 0
        this.rollNo=rollNo;
        this.name=name;
    }
    void display(){
        System.out.println("The name is:"+name);
        System.out.println("The roll No. is:"+rollNo);
    }
    public static void main(String[] args) {
        a27 obj=new a27(1,"John");
        obj.display();
    }
}
