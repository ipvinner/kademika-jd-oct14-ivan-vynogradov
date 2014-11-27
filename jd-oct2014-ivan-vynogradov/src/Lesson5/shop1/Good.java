package Lesson5.shop1;

public class Good {
	private String name;
	private double price;
	private String category;
	private String[] characteristics;
	
	
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCategory() {
		return category;
	}

	public String[] getCharacteristics() {
		return characteristics;
	}

	public Good(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public void changePrice(){
		System.out.println("price changed");
	}
	
}
