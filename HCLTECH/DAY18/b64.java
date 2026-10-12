package DAY18;

public class b64 {
    record student(int id,String name,int marks){
        public boolean isPassed(){
            return marks>=60;
        }
    }  
    public static void main(String[] args) {
        student s = new student(1,"Himanshu",90);
        System.out.println(s.id());
        System.out.println(s.isPassed());
    }
    
}
