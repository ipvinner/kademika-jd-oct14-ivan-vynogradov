package Lesson5.shop1;

import java.util.ArrayList;

import Lesson5.shop1.goods.Good;
import Lesson5.shop1.peoples.Sale;
import Lesson5.shop1.peoples.*;

public class Shop {
	private String name;
	private String city;
	private ArrayList<Sale> sales = new ArrayList<Sale>();
	private ArrayList<Employee> emploeeys = new ArrayList<Employee>();
	private ArrayList<String[]> salesList = new ArrayList<String[]>();
	private ArrayList<String[]> managersList = new ArrayList<String[]>();
	private ArrayList<Good> goods = new ArrayList<Good>();
	private ArrayList<String[]> goodsList = new ArrayList<String[]>();
	private ArrayList<Manager> managers = new ArrayList<Manager>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private ArrayList<String[]> customersList = new ArrayList<String[]>();
	private ArrayList<String[]> ordersList;
	
	
	public ArrayList<String[]> getManagerList() {
		return managersList;
	}
	
	public ArrayList<String[]> getSalesList() {
		return salesList;
	}

	public ArrayList<String[]> getCustomersList() {
		return customersList;
	}

	public ArrayList<String[]> getOrdersList() {
		return ordersList;
	}

	public ArrayList<String[]> getGoodsList() {
		return goodsList;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}
	
	public Shop(){
		
	}

	public Shop(String name, String city){
		System.out.println("shop created");
		this.name = name;
		this.city = city;
	}
	
	public void addEmployeeToList(Employee employee){
		
		String[] array = {employee.getFirstName(), employee.getLastName(), Integer.toString(employee.getAge()), Boolean.toString(employee.isSex())};
		
		if(employee instanceof Manager){
			managersList.add(array);
		}else if(employee instanceof Sale){
			salesList.add(array);
		}
	}
	
	public void addEmploee(Employee employee){
		emploeeys.add(employee);
	}
	
	public void addCustomer(Customer customer){
		customers.add(customer);
	}
	
	
	
	public void addGood(Good good){
			this.goods.add(good);		
			good.setCount(1);
			String[] goodArray = {good.getName(), Double.toString(good.getPrice()), good.getCategory(), Integer.toString(good.getCount())};
			this.goodsList.add(goodArray);
		
	}
	
	public void updateGood(int index, int count){
		String[] strArray = goodsList.get(index);
		strArray[3] = Integer.toString(count);
		goodsList.set(index, strArray);
	}
	
//	public void addGood(String name, double price, String category){
//		Good good = new Good(name, price, category);
//		addGoodToList(good.getName(), good.getPrice(), good.getCategory());
//	}
	
	
	public void addGoodToList(String name, double price, String category){
		String[] array = {name, Double.toString(price), category};
		this.goodsList.add(array);
		System.out.println("Sale added to list");
		System.out.println("Good added to Goodslist");
	}
	
	public void showArrayList(ArrayList<String[]> list, String name){
		System.out.println("+++++ " + name + " +++++++++++++");
		for(int i = 0; i < list.size(); i++){
			for(String s: list.get(i)){
				if (s.equals("true")){
					System.out.print("male   ");
				}else if(s.equals("false")){
					System.out.print("female   ");
				}else{
					System.out.print(s + "   ");
				}
				
			}
			System.out.println();
		}
	}
	
	public boolean isNewGood(Good good){
			
		String currentName = good.getName();
		
		for(int i = 0; i < goodsList.size(); i++){
			//System.out.println("goodsList name" + goodsList.get(i)[0]);
			if(currentName.equals(goodsList.get(i)[0])){
				return false;
			}
		}
		
		
		return true;
		
	}
	
	public int getIndex(String name){
		int result = 0;
		for(int i = 0; i < goodsList.size(); i++){
			//System.out.println("goodsList name" + goodsList.get(i)[0]);
			if(name.equals(goodsList.get(i)[0])){
				return i;
			}
		}
		return result;
	}
	
	public int getGoodCount(String name){
		int result = 1;
		for(int i = 0; i < goodsList.size(); i++){
			//System.out.println("goodsList name" + goodsList.get(i)[0]);
			if(name.equals(goodsList.get(i)[0])){
				//result = goodsList.get(i)[3];
			}
		}
		return result;
	}
	
	public Good getExistingGoodRef(Good good){
		//System.out.println("getExistingGoodRef");
		Good result = null;
		String currentName = good.getName();
		
		for(int i = 0; i < goodsList.size(); i++){
			//System.out.println("goodsList name" + goodsList.get(i)[0]);
			if(currentName.equals(goodsList.get(i)[0])){
				result = goods.get(i);
			}
		}
		
		return result;
		
	}
	
	
}
