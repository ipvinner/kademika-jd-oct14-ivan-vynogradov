package Lesson5.shop1;

public class Demo {

	public static void main(String[] args) {
		
		Shop iptel = new Shop("IPTel", "Odessa");
		iptel.hireSale("Oksana", "Osadchyk", 21, false, 3000);
		iptel.hireSale("Oleg", "Stepanov", 23, true, 3200);
		iptel.hireSale("Petr", "Michailov", 25, true, 3500);
		
		iptel.addGood("Digium D50", 1700, "IP-phones");
		iptel.addGood("Digium D60", 1900, "IP-phones");
		iptel.addGood("Digium D70", 2900, "IP-phones");
		
		iptel.addGood("Goip-4", 4900, "gateways");
		iptel.addGood("Goip-8", 6900, "gateways");
		
		Customer customer1 = new Customer();
		RegularCustomer customer2 = new RegularCustomer("Ivan", "Vinogradov", "+380638925486", false);
		RegularCustomer customer3 = new RegularCustomer("Ivan", "Ivanov", "+380638925487", true);
		
		Sales ServiceSale = customer2.getHelp();
		//customer2.getGoodByCategory("test", ServiceSale);
		
	}

}
