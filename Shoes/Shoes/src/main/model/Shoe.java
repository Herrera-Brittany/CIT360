
package main.model;

public class Shoe {
    

	private String style;
	private String material;
	private String color;
	
	
	public Shoe(String style, String material, String color) {
		this.style = style;
		this.material = material;
		this.color = color;
		
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	@Override
	public String toString() {
		return "Shoe [style=" + style + ", material=" + material + ", color=" + color + "]";
	}
}