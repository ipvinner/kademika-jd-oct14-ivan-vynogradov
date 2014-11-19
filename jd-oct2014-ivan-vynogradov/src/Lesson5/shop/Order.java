package Lesson5.shop;

import java.util.Calendar;

public class Order {
	
	public static String[][] orders = new String[10][6];
	
	public void addOrder(String customerName, String goodName, int count, int year, int day, int month){
		int lastIndex = getLastOrderIndex();
		
		orders[lastIndex][0] = customerName;
		orders[lastIndex][1] = goodName;
		orders[lastIndex][2] = Integer.toString(count);
		orders[lastIndex][3] = Integer.toString(year);
		orders[lastIndex][4] = Integer.toString(month);
		orders[lastIndex][5] = Integer.toString(day);
	}
	
	public static void showAllOrders(){
		if (orders != null) {
			System.out.println("Customer name|||goodName|||count|||year|||month|||day");
			for (String[] order : orders) {
				if(order[0] == null) {
					break;
				}else {
					for (String orderField : order) {
							System.out.print(orderField + " |||");
					}
					System.out.println();
				}
			}
		} else {
			System.out.println("Orders is empty");
		}
	}
	
	public static void showAllOrdersDaysLimit(int days){
			int totalCount = 0;
			int altogether = 0;
		if (orders != null) {
			System.out.println("Customer name|||goodName|||count|||year|||day||month");
			for (String[] order : orders) {
				if(order[0] == null) {
					break;
				}else if(Utils.checkDaysRestriction(days, Integer.parseInt(order[3]), Integer.parseInt(order[4]), Integer.parseInt(order[5]))){
					altogether ++;
					totalCount += Integer.parseInt(order[2]);
					for (String orderField : order) {
							System.out.print(orderField + " |||");
					}
					System.out.println();
				}else {
					continue;
				}
			}
		} else {
			System.out.println("Orders is empty");
		}
		
		System.out.println("altogether: " + altogether);
		System.out.println("Total count: " + totalCount);
	}
	
	private int getLastOrderIndex() {

		for (int i = 0; i < orders.length; i++) {
			if (orders[i][0] == null) {
				return i;
			}

		}
		return 0;

	}
	
	
	
	
	
	
}
