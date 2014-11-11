package Lesson5.shop;

public class Demo {

	public static void main(String[] args) {
		
		
		Customer customer1 = new Customer("Ivan Vynogradov", "vaniavinogradov@rambler.ru", "+380638925486", "Odessa");
		Customer customer2 = new Customer("Vitaliy Samotko", "vsamotko@gmail.com", "+38066757666", "Ilyichevsk");
		Customer customer3 = new Customer("Ivan Ivanov", "ivanov@mail.ru", "+380505002060", "Kiev");
		
		customer3.showAllCustomers();
		
		IPphone ipphone1 = new IPphone("Digium D50", 2450, 8, "Digium D50 4 line appearance keys");
		IPphone ipphone2 = new IPphone("Digium D70", 3514, 5, "Digium D70 8 line appearance keys");
		IPphone ipphone3 = new IPphone("Snom 300", 1500, 4, "Snom 300 2 line appearance keys");
		
		Gateway gate1 = new Gateway("Goip-4", 4500, 3, "gsm gateway with 4 port");
		Gateway gate2 = new Gateway("Goip-4", 8100, 2, "gsm gateway with 8 sim-cards");
		
		System.out.println("------------------All goods----------------");
		Goods.getGoodsInfo();
		
		customer3.buy("Digium D50", 1);
		customer2.buy("Digium D70", 1);
		System.out.println("------------------All goods----------------");
		Goods.getGoodsInfo();
		System.out.println("-------------------Orders------------------");
		Order.showAllOrders();
		
		System.out.println("-------------------Time test------------------");
		customer1.compareDate();
	}

}
