package Lesson5.shop1;

import Lesson5.shop1.goods.Gateway;
import Lesson5.shop1.goods.Good;
import Lesson5.shop1.goods.Phone;
import Lesson5.shop1.peoples.Boss;
import Lesson5.shop1.peoples.Customer;
import Lesson5.shop1.peoples.Employee;
import Lesson5.shop1.peoples.Manager;
import Lesson5.shop1.peoples.NewCustomer;
import Lesson5.shop1.peoples.RegularCustomer;
import Lesson5.shop1.peoples.Sale;

public class Demo {

	public static void main(String[] args) {
		
		// Boss is making shop
		Boss boss = new Boss("Pavel", "Zukov", 68900);
		Shop newShop = boss.openShop("IPTel", "Odessa");
		
		// Creates managers and sales
		Manager manager1 = new Manager("Anastasia", "Ryabko", 40, false);
		Manager manager2 = new Manager("Svetlana", "Petrova", 42, false);
		
		Sale sale1 = new Sale("Oksana", "Osadchyk", 21, false);
		Sale sale2 = new Sale("Oleg", "Stepanov", 23, true);
		Sale sale3 = new Sale("Petr", "Michailov", 25, true);
		Sale sale4 = new Sale("Mikhail", "Voropaev", 29, true);
		
		// Boss is recruiting managers
		boss.hireStaff(manager1, newShop);
		boss.hireStaff(manager2, newShop);
		
		newShop.showArrayList(newShop.getManagerList(), "Managers List");
		
		// Managers and Boss is recruiting managers
		manager1.hireStaff(sale1, newShop);
		manager1.hireStaff(sale2, newShop);
		manager2.hireStaff(sale3, newShop);
		boss.hireStaff(sale4, newShop);
		
		newShop.showArrayList(newShop.getSalesList(), "Sales List");
		
		// Employees starting work
		manager1.work(newShop);
		manager2.work(newShop);
		
		sale1.work(newShop);
		sale2.work(newShop);
		sale3.work(newShop);
		sale4.work(newShop);
		
		// Bring goods
		Good good1 = new Phone("Digium D50", 1700, "IP-phones");
		Good good2 = new Phone("Digium D60", 1900, "IP-phones");
		Good good3 = new Phone("Digium D70", 2900, "IP-phones");
		Good good4 = new Gateway("Goip-4", 4900, "gateways");
		Good good5 = new Gateway("Goip-8", 6900, "gateways");
		Good good6 = new Gateway("Goip-16", 16900, "gateways");
		Good good7 = new Gateway("Goip-4", 4900, "gateways");
		Good good8 = new Gateway("Goip-4", 4900, "gateways");
		Good good9 = new Phone("Digium D50", 1700, "IP-phones");
		
		// Manager adding goods to the shop
		manager1.acceptGood(good1, newShop);
		manager1.acceptGood(good2, newShop);
		manager1.acceptGood(good3, newShop);
		manager2.acceptGood(good4, newShop);
		manager2.acceptGood(good5, newShop);
		manager2.acceptGood(good6, newShop);
		manager2.acceptGood(good7, newShop);
		manager2.acceptGood(good8, newShop);
		manager1.acceptGood(good9, newShop);
		
		newShop.showArrayList(newShop.getGoodsList(), "Goods List");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		// customers:
		
		Customer customer1 = new RegularCustomer("Ivan", "Vinogradov", "+380638925486", 5.0);
		Customer customer2 = new RegularCustomer("Ivan", "Ivanov", "+380638925487", 3.0);
		Customer customer3 = new NewCustomer();
		Customer customer4 = new NewCustomer();
		
		customer1.visitShop(newShop);
		customer2.visitShop(newShop);
		customer3.visitShop(newShop);
		customer4.visitShop(newShop);
		
		customer1.getHelp();
		customer2.getHelp();
		
		customer1.buy(sale1, good1, 1);

//		
//		Sale serviceSale = customer2.getHelp();
//		customer2.getAllGoods(serviceSale);
//		customer2.buy("Digium D50", 1);
		
	}

}
