package Lesson5.shop1.peoples;

import Lesson5.shop1.Shop;
import Lesson5.shop1.goods.Good;


public class Customer {
	
	
	

	public Customer(){
		//System.out.println("new customer");
	}
	
	public void buy(){
		
	}
	
	public void visitShop(Shop shop){
		shop.addCustomer(this);
	}
	
	public void buy(Employee employee, Good good, int count){
		System.out.println("Customer bought " + good.getName() + " count: " + count);
		employee.createOrder(good, count);
	}
	
	public void getHelp(){
		System.out.println("customer got help from sales or manager");
		
	}
	
	public void getGoodByName(String name){
		
	}
	
	public void getGoodByCategory(String category, Sale sale){
		
	}
	
	public void getAllGoods(Sale sale){
		System.out.println("Sale show goods to Customer");
	}
	
}
