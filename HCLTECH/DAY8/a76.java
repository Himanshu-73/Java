package DAY8;
//Static variable in Generic Classes
//Due to type erasures, java creates only one class at runtime for all the different types of generic classes. So, if we declare a static variable in a generic class, it will be shared among all the different types of generic classes.

public class a76<T> {
    static class Count<T> { // 1. Added <T> to make Count generic
        private static int count=0;
        Count(){
            count++; 
        }
        public static int getCount() { return count; } // 2. Added getter method
    };
    public static void main(String args[]){
        Count<Integer> c1=new Count<>();
        Count<String> c2=new Count<>(); 
        Count<Double> c3=new Count<>();
        System.out.println("Count of objects created: "+Count.getCount());
    }
}
