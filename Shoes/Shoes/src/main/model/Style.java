
package main.model;

public enum Style {

	WESTERN("Western"),
	ATHLETIC("Athletic"),
	DRESS("Dress"),
	CASUAL("Casual"),
	SLIPPERS("Slippers"),
	WATER("Water");
	
	private String name;
	
	private Style(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}