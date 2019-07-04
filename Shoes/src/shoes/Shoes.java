/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoes;
import java.util.*;

public class Shoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// TODO code application logic here
      ShoesController delegate = new ShoesController();
      Scanner input = new Scanner(System.in);
      
      try {
          System.out.println("---Menu---");
          System.out.println("Heels");
          System.out.println("Flats");
          System.out.println("Running");
          System.out.println("Boots");
          System.out.println("Clogs");
          System.out.println("Booties");
          System.out.println("What Shoes Match Your Outfit?");
          String command = input.nextLine();
          int amount = input.nextInt();
          
          HashMap data = new HashMap();
          data.put("amout", amount);
          data.put("Heels",35.00);
          data.put("Flats", 25.00);
          data.put("Tennis Shoes", 65.00);
          data.put("Boots", 95.00);
          data.put("Water Shoes", 15.00);
          data.put("Booties", 55.00);
          data.put("Your Total Price", "Less than 100");
          
          delegate.handleCommand(command, data);
          
      } catch (Exception e) {
          System.out.println("Item does not exist in the menu!");
      }
    }
    
}
