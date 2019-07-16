package main.model;

public enum Style {
	
	WESTERN("Western"),
	CASUAL("Casual"),
	ATHLETIC("Athletic"),
	BUSINESS("Business"),
	FORMAL("Formal"),
	HIKING("Hiking");
	
	private String name;
	
	private Style(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}