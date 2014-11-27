package Lesson5.shop1;

import java.util.ArrayList;

public class Shop {
	private String name;
	private String city;
	private ArrayList<String[]> salesList = new ArrayList<String[]>();
	private ArrayList<String[]> customersList;
	private ArrayList<String[]> ordersList;
	private ArrayList<String[]> goodsList = new ArrayList<String[]>();
	
	public ArrayList<String[]> getSalesList() {
		return salesList;
	}

	public ArrayList<String[]> getCustomersList() {
		return customersList;
	}

	public ArrayList<String[]> getOrdersList() {
		return ordersList;
	}

	public ArrayList<String[]> getGoodsList() {
		return goodsList;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
	
	public Shop(){
		
	}

	public Shop(String name, String city){
		System.out.println("shop created");
		this.name = name;
		this.city = city;
	}
	
	public void hireSale(String firstName, String lastName, int age, boolean sex,double salary){
		Sale sale = new Sale(firstName, lastName, age, sex, salary);
		addSaleToList(sale.getFirstName(), sale.getLastName(), sale.getAge(), sale.isSex(), sale.getSalary(), true);
	}
	
	public void addGood(String name, double price, String category){
		Good good = new Good(name, price, category);
		addGoodToList(good.getName(), good.getPrice(), good.getCategory());
	}
	
	public void addSaleToList(String firstName, String lastName, int age, boolean sex, double salary, boolean isFreeNow){
		String[] array = {firstName, lastName, Integer.toString(age), Boolean.toString(sex), Double.toString(salary), Boolean.toString(isFreeNow)};
		this.salesList.add(array);
		System.out.println("Sale added to list");
	}

	
	public void addGoodToList(String name, double price, String category){
		String[] array = {name, Double.toString(price), category};
		this.goodsList.add(array);
		System.out.println("Sale added to list");
		System.out.println("Good added to Goodslist");
	}
	
	public void showArrayList(ArrayList<String[]> list, String name){
		System.out.println("+++" + name + "+++");
		for(int i = 0; i < list.size(); i++){
			for(String s: list.get(i)){				
				System.out.print(s + "   ");
			}
			System.out.println();
		}
	}
	
	
}
