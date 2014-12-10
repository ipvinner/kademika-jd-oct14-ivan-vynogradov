package Lesson5.shop1.goods;

public class Good {
	private String name;
	private double price;
	private String category;
	private int count;
	private String[] characteristics;
	
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

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
	
	public void changePrice(double price){
		this.price = price;
	}
	
	
	
}
