package Lesson5.shop1;

public class Customer {
	
	private Sale serviceSale = new Sale();
	
	
	
	public Sale getServiceSale() {
		return serviceSale;
	}

	public void setServiceSale(Sale serviceSale) {
		this.serviceSale = serviceSale;
	}

	public Customer(){
		//System.out.println("new customer");
	}
	
	public void buy(){
		
	}
	
	public void buy(String name, int count){
		System.out.println("Customer bought " + name + " count: " + count);
		serviceSale.finishPurchase(name, count);
	}
	
	public Sale getHelp(){
		System.out.println("needs to choose free sale");
		System.out.println("sale was choosen from salesList");
		System.out.println("this sale status changed to busy");
		this.setServiceSale(serviceSale);
		return null;
	}
	
	public void getGoodByName(String name){
		
	}
	
	public void getGoodByCategory(String category, Sale sale){
		
	}
	
	public void getAllGoods(Sale sale){
		System.out.println("Sale show goods to Customer");
	}
	
}
