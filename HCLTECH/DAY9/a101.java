package DAY9;
import java.util.ArrayList;
import java.util.List;
public class a101 {
    public static void main(String[] args) {
        List<int[]> lst= new ArrayList<>();
        int count=0;
        while (true){
            lst.add(new int[250000]);
            count++;
            System.out.println("Added "+count+" arrays of 250,000 integers");
        }
    }
}


//*250,000*4 bytes 
// =1,000,000 bytes = 1MB
// =0.95MB
// Block 1 MB 
// but there's an important point
// in the range min 2 max 4 it will 
// be allocated in the same block
// so there will only be 2 blocks of 2 mb
// */
