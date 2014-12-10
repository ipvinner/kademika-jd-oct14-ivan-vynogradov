package Lesson5.shop1;

import java.util.ArrayList;

import Lesson5.shop1.goods.Good;

public class Order {
	private Good good;
	private int count;
	private double totalPrice;
	ArrayList<String[]> ordersList;
	
	public void addOrder(int count, double totalPrice){
		
		this.count = count;
		this.totalPrice = totalPrice;
	}
	
	public void showOrders(){
		System.out.println("show all orders");
	}
}
