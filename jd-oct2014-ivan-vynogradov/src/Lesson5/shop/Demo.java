package Lesson5.shop;

public class Demo {

	public static void main(String[] args) {
		
		
		Customer customer1 = new Customer("Ivan Vynogradov", "vaniavinogradov@rambler.ru", "+380638925486", "Odessa");
		Customer customer2 = new Customer("Vitaliy Samotko", "vsamotko@gmail.com", "+38066757666", "Ilyichevsk");
		Customer customer3 = new Customer("Ivan Ivanov", "ivanov@mail.ru", "+380505002060", "Kiev");
		
		customer3.showAllCustomers();

	}

}
