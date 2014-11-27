package Lesson5.shop1;

import java.util.ArrayList;

public class Order {
	private String goodName;
	private int count;
	private double totalPrice;
	ArrayList<String[]> ordersList;
	
	public void addOrder(String goodName, int count, double totalPrice){
		this.goodName = goodName;
		this.count = count;
		this.totalPrice = totalPrice;
	}
	
	public void showOrders(){
		System.out.println("show all orders");
	}
}
