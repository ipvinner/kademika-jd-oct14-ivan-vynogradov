package Lesson5.shop;

public class Gateway extends Goods {
	
	private String category = "Gateway";
	
	public Gateway(String goodName, double goodPrice, int goodCount, String desc){
		this.addGood(goodName, goodPrice, goodCount, this.category, desc);
	}
	
	@Override
	public void addGood(String goodName, double goodPrice, int goodCount, String category, String desc) {
		// TODO Auto-generated method stub
		super.addGood(goodName, goodPrice, goodCount, category, desc);
	}
	
	
}
