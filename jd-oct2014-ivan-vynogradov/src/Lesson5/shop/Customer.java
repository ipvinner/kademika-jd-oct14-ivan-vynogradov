package Lesson5.shop;

public class Customer {
	private String name;
	private String email;
	private String phone;
	private String city;

	public static String[][] customers = new String[10][4];
	
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
		Boolean proverka;
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

	public void buy(String goodName, String count) {

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
