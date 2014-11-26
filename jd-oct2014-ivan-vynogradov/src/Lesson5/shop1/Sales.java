package Lesson5.shop1;

public class Sales {
	private String firstName;
	private String lastName;
	private int age;
	private boolean sex;
	private double salary;
	
	public Sales(String firstName, String lastName, int age, boolean sex,double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
	}
	
	public void showAllGoods(){
		
	}
	
	public void showGoodByName(String name){
		
	}
	
	public void showGoodsByCategory(String category){
		System.out.println("getGoodByCategory: this method will show list of goods from this category or empty if category will be empty");
	}
	
	public void makeOrder(){
		
	}
	
}
