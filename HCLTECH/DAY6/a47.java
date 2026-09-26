package DAY6;

public class a47 {
    //Loading java mysql driver
    //class.forName("com.mysql.jdbc.driver");
    public static void main(String[] args) {
        
        try{
            Class.forName("com.mysql.jdbc.driver");
        } catch(Exception e){
            System.out.println(e);
        }
    }
}


//Try- risky code
//Catch- Handling Code
//Finally- clean code 