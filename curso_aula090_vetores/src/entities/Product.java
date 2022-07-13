package entities;

public class Product {
	private String nameString;
	private double price;
	public String getNameString() {
		return nameString;
	}
	
	public Product(String nameString, double price) {
		this.nameString = nameString;
		this.price = price;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
