package Lesson5.shop1.peoples;

import Lesson5.shop1.Order;
import Lesson5.shop1.Shop;

public class Sale extends Employee {
	private String firstName;
	private String lastName;
	private int age;
	private boolean sex;
	private double salary;
	
	
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public boolean isSex() {
		return sex;
	}

	public double getSalary() {
		return salary;
	}
	
	public Sale(){
		
	}
	
	public Sale(String firstName, String lastName, int age, boolean sex) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
		
	}
	
	public Sale(String firstName, String lastName, int age, boolean sex,double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
	}
	
		
	public void showGoodByName(String name){
		
	}
	
	public void showGoodsByCategory(String category){
		System.out.println("getGoodByCategory: this method will show list of goods from this category or empty if category will be empty");
	}
	
	public void finishPurchase(String name, int count){
		System.out.println("Sale made order and add to OrdersList");
		
	}
	
	public void makeOrder(){
		
	}
	
}
