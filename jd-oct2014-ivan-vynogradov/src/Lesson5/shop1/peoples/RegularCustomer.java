package Lesson5.shop1.peoples;


public class RegularCustomer extends Customer{
	private String firstName;
	private String lastName;
	private Double discount;
	private String phone;
	
	public RegularCustomer(String firstName, String lastName, String phone, double discount) {
		//System.out.println("Regular customer");
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.discount = discount;
	}
	
	
}
