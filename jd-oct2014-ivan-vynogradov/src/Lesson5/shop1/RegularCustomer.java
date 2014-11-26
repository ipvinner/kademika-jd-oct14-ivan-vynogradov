package Lesson5.shop1;

public class RegularCustomer extends Customer{
	private String firstName;
	private String lastName;
	private boolean hasDiscount;
	private String phone;
	
	public RegularCustomer(String firstName, String lastName, String phone, boolean hasDiscount) {
		System.out.println("Regular customer");
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.hasDiscount = hasDiscount;
	}
	
	
}
