package Lesson5.shop;

public class Order {
	
	public static String[][] orders = new String[10][5];
	
	public void addOrder(String customerName, String goodName, int count, int day, int month){
		int lastIndex = getLastOrderIndex();
		
		orders[lastIndex][0] = customerName;
		orders[lastIndex][1] = goodName;
		orders[lastIndex][2] = Integer.toString(count);
		orders[lastIndex][3] = Integer.toString(day);
		orders[lastIndex][4] = Integer.toString(month);
	}
	
	public static void showAllOrders(){
		if (orders != null) {
			System.out.println("Customer name|||goodName|||count|||day||month");
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
	
	private int getLastOrderIndex() {

		for (int i = 0; i < orders.length; i++) {
			if (orders[i][0] == null) {
				return i;
			}

		}
		return 0;

	}
}
