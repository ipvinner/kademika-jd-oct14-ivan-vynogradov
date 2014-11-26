package Lesson5.shop1;

public class Customer {
	
	
	public Customer(){
		//System.out.println("new customer");
	}
	
	public void buy(){
		
	}
	
	public Sales getHelp(){
		System.out.println("needs to choose free sale");
		System.out.println("sale was choosen from salesList");
		System.out.println("this sale status changed to busy");
		return null;
	}
	
	public void getGoodByName(String name){
		
	}
	
	public void getGoodByCategory(String category, Sales sale){
		sale.showGoodsByCategory(category);
	}
	
	public void getAllGoods(){
		
	}
	
}
