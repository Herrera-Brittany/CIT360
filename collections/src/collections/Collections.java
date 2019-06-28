
package collections;
import java.util.*;
/**
 *
 * @author PC User
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] things ={"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();
        
        for(String x: things)
            list1.add(x);
        String[] morethings = {"lasers", "hats"};
       List<String> list2 = new ArrayList<String>();
       for(String y: morethings)
           list2.add(y);
       
       for(int i =0;i<list1.size();i++) {
           System.out.printf("%s ", list1.get(i));
       }
    }
    
}
