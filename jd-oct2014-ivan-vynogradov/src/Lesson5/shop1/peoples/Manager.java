package Lesson5.shop1.peoples;

import Lesson5.shop1.Shop;
import Lesson5.shop1.goods.Good;

public class Manager extends Employee {
	
	protected String firstName;
	protected String lastName;
	protected int age;
	protected boolean sex;
	protected double salary;
	
	public Manager(String firstName, String lastName, int age, boolean sex) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
		
	}
	
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
	
	public void hireStaff(Employee employee, Shop shop) {
		shop.addEmployeeToList(employee);
	}
	
	public void acceptGood(Good good, Shop shop){
		if(shop.isNewGood(good)){
			shop.addGood(good);
		}else{
			Good existingGood = shop.getExistingGoodRef(good);
			int goodCount = existingGood.getCount();
			goodCount++;
//			System.out.println("count" + goodCount);
//			System.out.println(existingGood);
			existingGood.setCount(goodCount);
			
			int goodIndex = shop.getIndex(good.getName());
			shop.updateGood(goodIndex, goodCount );
			
		}
		
	}

}
