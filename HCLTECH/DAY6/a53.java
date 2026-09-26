package DAY6;
import java.io.FileOutputStream;
import java.io.IOException;
public class a53 {
    public static void main(String[] args) {
        try {
            FileOutputStream output=new FileOutputStream("D://test.txt");
            output.write("Hello".getBytes());
            output.close();
            System.out.println("Successfully wrote the file.");
        } catch (IOException e) {
            System.out.println("Error Writing file.");
        }
    }
    
}
