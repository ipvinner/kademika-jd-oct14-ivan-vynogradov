package Lesson5.shop1.peoples;

import Lesson5.shop1.Shop;
import Lesson5.shop1.goods.Good;

public class Employee {
	
	protected String firstName;
	protected String lastName;
	protected int age;
	protected boolean sex;
	
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
	
	public void receiveSalary(){
		
	}
	
	public void work(Shop shop){
		shop.addEmploee(this);
	}
	
	public void createOrder(Good good, int count){
		
	}
	
	
}
