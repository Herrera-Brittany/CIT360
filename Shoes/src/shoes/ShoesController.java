/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoes;
import java.util.*;


/**
 *
 * @author PC User
 */
public class ShoesController {
private HashMap<String,Shoeshandler> haspMapOfCommands = new HashMap<String,Shoeshandler>();

public ShoesController(){
    hashMapOfCommands.put("heels", new HeelsHandler());
    hashMapOfCommands.put("Heels", new HeelsHandler());
    hashMapOfCommands.put("flats", new FlatsHandler());
    hashMapOfCommands.put("Flats", new FlatsHandler());
    hashMapOfCommands.put("running", new runningHandler());
    hashMapOfCommands.put("Running", new RunningHandler());
    hashMapOfCommands.put("boots", new BootsHandler());
    hashMapOfCommands.put("Boots", new bootsHandler());
    hashMapOfCommands.put("clogs", new ClogsHandler());
    hashMapOfCommands.put("Clogs", new ClogsHandler());
}
public void handleCommand(String command,HashMap data) {
    Shoeshandler handler = hashMapOfCommands.get(command);
    handler.handleIt(data);
}

}
