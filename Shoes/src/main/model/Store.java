package main.model;

import java.util.ArrayList;

public class Store {
	
	private ArrayList<Shoe> shoes;

	public Store() {
		shoes = new ArrayList<>();
		String gucci = "Gucci";
		String leather = "Leather";
		String imported = "Imported";
		
		shoes.add(new Shoe(gucci, "Imported", leather, Style.BUSINESS));
		shoes.add(new Shoe(gucci, "Imported", leather, Style.BUSINESS));
		shoes.add(new Shoe(gucci, "Imported", leather, Style.BUSINESS));
		
		shoes.add(new Shoe(gucci, "Domestic", leather, Style.CASUAL));
		shoes.add(new Shoe(gucci, "Domestic", leather, Style.CASUAL));
		shoes.add(new Shoe(gucci, "Domestic", leather, Style.CASUAL));
		shoes.add(new Shoe(gucci, "Imported", leather, Style.CASUAL));
		shoes.add(new Shoe(gucci, "Imported", leather, Style.CASUAL));
	}
	
	public void addShoe(Shoe shoe) {
		this.shoes.add(shoe);
	}

//	@Override
//	public String toString() {
//		return "Library [books=" + books + "]";
//	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Store [shoes=\n\t");
		ArrayList<String> shoeList = new ArrayList<>();
		for(Shoe shoe : shoes) {
			shoeList.add(shoe.toString());
		}
		String shoeStrings = String.join(",\n\t", shoeList);
		builder.append(shoeStrings);
		builder.append("\n]");
		return builder.toString();
	}
}