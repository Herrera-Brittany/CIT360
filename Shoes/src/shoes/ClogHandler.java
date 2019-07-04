
package shoes;

import java.text.NumberFormat;
import java.util.HashMap;

public class ClogHandler implements Shoeshandler {
    
    public void handleIt(HashMap data)  {
        try {
            FileReader fileReader = new FileReader();
            HashMap d1 = fileReader.readFile();

            System.out.println("Great Choice");
            System.out.println(d1.get("Clogs"));
            HashMap d2 = (HashMap) data;
            int numberAmount = (Integer) d2.get("amount");
            double totalAmount = numberAmount * (Double) d2.get("clogPrice");

            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            System.out.println("Your total amount is " + formatter.format(totalAmount));

            System.out.println("Clogs for Life!");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}