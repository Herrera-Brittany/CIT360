/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoes;

import java.text.NumberFormat;
import java.util.HashMap;
/**
 *
 * @author PC User
 */
public class FlatsHandler implements Shoeshandler {


    public void handleIt(HashMap data)  {
        try {
            FileReader fileReader = new FileReader();
            HashMap d1 = fileReader.readFile();

            System.out.println("Great Choice");
            System.out.println(d1.get("Flats"));
            HashMap d2 = (HashMap) data;
            int numberAmount = (Integer) d2.get("amount");
            double totalAmount = numberAmount * (Double) d2.get("flatsPrice");

            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            System.out.println("Your total amount is " + formatter.format(totalAmount));

            System.out.println("Flats are always comfy!");

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}