package Lesson5.shop1.peoples;

import Lesson5.shop1.Shop;

public class Boss {

	private double totalMoney;
	private String firstName;
	private String lastName;
	private double enouthForOpenShop = 50000;

	public Boss(String firstName, String lastName, double totalMoney) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalMoney = totalMoney;
	}

	public void hireStaff(Employee employee, Shop shop) {
		shop.addEmployeeToList(employee);
	}

	public void fireStaff(Employee employee) {

	}

	public Shop openShop(String name, String city) {
		if (this.totalMoney > enouthForOpenShop) {
			Shop shop = new Shop(name, city);
			return shop;
		} else {
			System.out.println("you need more money");
			return null;
		}
	}

}
