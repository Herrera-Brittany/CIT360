
package main.handlers;
import java.util.HashMap;

import main.model.Store;

public class DisplayShoesHandler implements Handler {
    

	@Override
	public Object handleIt(HashMap<String, Object> data) {
		Store store = (Store) data.get("store");

		String s = store.toString();
		System.out.println(s);
		return null;
	}

}
