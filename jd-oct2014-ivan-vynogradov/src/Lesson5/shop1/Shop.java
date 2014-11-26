package Lesson5.shop1;

import java.util.ArrayList;

public class Shop {
	private String name;
	private String city;
	private ArrayList<String[]> salesList;
	private ArrayList<String[]> customersList;
	private ArrayList<String[]> ordersList;
	private ArrayList<String[]> goodsList;
	
	public Shop(String name, String city){
		System.out.println("shop created");
		this.name = name;
		this.city = city;
	}
	
	public void hireSale(String firstName, String lastName, int age, boolean sex,double salary){
		new Sales(firstName, lastName, age, sex, salary);
		addSaleToList(firstName, lastName, age, sex, salary, true);
	}
	
	public void addGood(String name, double price, String category){
		new Good(name, price, category);
		addGoodToList(name, price, category);
	}
	
	public void addSaleToList(String firstName, String lastName, int age, boolean sex, double salary, boolean isFreeNow){
		System.out.println("Sale added to list");
	}
	
	public void addGoodToList(String name, double price, String category){
		System.out.println("Good added to Goodslist");
	}
	
	
}
