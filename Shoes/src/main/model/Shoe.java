package main.model;

public class Shoe {
	
	private String brand;
	private String material;
	private String gender;
	private Style style;
	
	public Shoe(String brand, String material, String gender, Style style) {
		this.brand = brand;
		this.material = material;
		this.gender = gender;
		this.style = style;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return "Shoe [brand=" + brand + ", material=" + material + ", gender=" + gender + ", style=" + style.toString() + "]";
	}
}