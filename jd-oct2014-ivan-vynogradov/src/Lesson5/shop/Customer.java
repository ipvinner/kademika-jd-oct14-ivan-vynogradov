package Lesson5.shop;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Customer {
	private String name;
	private String email;
	private String phone;
	private String city;
	private Order order = new Order();

	public static String[][] customers = new String[10][4];
	
	List<List<String>> customersList = new ArrayList<List<String>>();
	
	
	Customer(){
		
	}

	Customer(String name, String email, String phone, String city) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		addCustomer(name, email, phone, city);
	}

	public void showAllGoods() {

	}
	
	public void showAllCustomers(){
		//Boolean proverka;
		if (customers != null) {
			System.out.println("Customer name         |||CustomerEmail        |||CustomerPhone      |||     Customer city");
			for (String[] customer : customers) {
				if(customer[0] == null) {
					continue;
				}else {
					for (String customerField : customer) {
							System.out.print(customerField + " |||");
					}
					System.out.println();
				}
			}
		} else {
			System.out.println("any customers");
		}
	}

	public void buy(String goodName, int count) {
		Goods.updateGoodsArray(goodName, count);
		int day = Utils.getDay();
		int month = Utils.getMoth();
		int year = Utils.getYear();
		order.addOrder(this.name, goodName, count, year, day, month);
		
	}

	private void addCustomer(String name, String email, String phone, String city) {
		int lastIndex = getLastCustomerIndex();
		
		customers[lastIndex][0] = name;
		customers[lastIndex][1] = email;
		customers[lastIndex][2] = phone;
		customers[lastIndex][3] = city;
	}
	
	

	private int getLastCustomerIndex() {

		for (int i = 0; i < customers.length; i++) {
			if (customers[i][0] == null) {
				return i;
			}

		}
		return 0;

	}
	
	

}
