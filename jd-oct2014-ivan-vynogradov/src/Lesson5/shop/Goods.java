package Lesson5.shop;

public class Goods {
	protected double price;
	protected int count;
	public static String[][] allGoods = new String[10][5];
	
	public static void getGoodsInfo(){
		if (allGoods != null) {
			System.out.println("Good name|||Good Price|||Count|||Category || Description");
			for (String[] allGood : allGoods) {
				if(allGood[0] == null) {
					continue;
				}else {
					for (String goodField : allGood) {
							System.out.print(goodField + " |||");
					}
					System.out.println();
				}
			}
		} else {
			System.out.println("any customers");
		}
	}
	
	
	
	protected void addGood(String goodName, double goodPrice, int goodCount, String category, String desc){
		int lastIndex = getLastCustomerIndex();
		allGoods[lastIndex][0] = goodName;
		allGoods[lastIndex][1] = Double.toString(goodPrice);
		allGoods[lastIndex][2] = Integer.toString(goodCount);
		allGoods[lastIndex][3] = category;
		allGoods[lastIndex][4] = desc;
		
	}
	
	public static void updateGoodsArray(String goodName, int count){
			System.out.println("updateGoodsArray");
		for (String[] allGood : allGoods) {
			if(allGood[0] == null || !allGood[0].equals(goodName)) {
				continue;
			}else {
				allGood[2] = Integer.toString(Integer.valueOf(allGood[2]) - count);
			}
		}
	}
	
	private int getLastCustomerIndex() {

		for (int i = 0; i < allGoods.length; i++) {
			if (allGoods[i][0] == null) {
				return i;
			}

		}
		return 0;

	}
	
	
}
