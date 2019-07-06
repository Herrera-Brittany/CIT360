package main.handlers;

import java.util.HashMap;
import java.util.Scanner;

import main.model.Shoe;
import main.model.Style;
import main.model.Store;


public class AddShoeHandler implements Handler {

	@Override
	public Object handleIt(HashMap<String, Object> data) {
		Scanner scanner = (Scanner) data.get("scanner");
		Store store = (Store) data.get("store");

		System.out.print("Enter an Style: ");
		String style = scanner.nextLine();
		System.out.print("Enter a Material: ");
		String material = scanner.nextLine();
		System.out.print("Enter a Color: ");
		String color = scanner.nextLine();
                
		
int i = 1;
Style[] styles = Style.values();
int styleSelection = 0;
while (styleSelection < 1 || styleSelection > styles.length) {
	for (Style style : styles) {
		System.out.println(i++ + "-" + style.toString());
	}
	System.out.print("Select a style: ");
	styleSelection = GetNextInt(scanner);
	i = 1;
}
Style selectedStyle = styles[styleSelection - 1];

Shoe newShoe = new Shoe(style, material, color);
store.addShoe(newShoe);
	return null;
	}

	private int GetNextInt(Scanner scanner) {
		String input = scanner.nextLine();
		try {
			return Integer.parseInt(input);
		} catch (Exception e) {
			System.out.println("Please choose a Style from the list");
			return -1;
		}
	}
}