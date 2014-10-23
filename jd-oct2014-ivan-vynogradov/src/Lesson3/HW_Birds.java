package Lesson3;

public class HW_Birds {

	public static void main(String[] args) {
		
		String[][] birds = {{"1", "parrot", "20", "1"},
				{"2", "eagle", "10", "5"},
				{"3", "sparrow", "12", "11"},
				{"4", "tit", "10", "7"}};
		
//		System.out.println(totalBirdsSold(birds));
//		System.out.println(birdsInStock(birds, "parrot"));
		System.out.println(lessThen3(birds));
	}
	
	static int totalBirdsSold(String[][] birds){
			int totalBirdsSold = 0;
		for(int i = 0; i < birds.length; i++){
			totalBirdsSold += Integer.parseInt(birds[i][3]);
		}
		
		return totalBirdsSold;
		
	}
	
	static int birdsInStock(String[][] birds, String birdType){
		int birdsInStock = 0;
		
		for(int i = 0; i < birds.length; i++){
			if(birds[i][1].equals(birdType)){
				birdsInStock = Integer.parseInt(birds[i][2]) - Integer.parseInt(birds[i][3]);}
		}
		
		return birdsInStock;
		
	}
	
	static String lessThen3(String[][] birds){
		String lessThen3BirdType = "";
		int birdsInStock = 0;
		for(int i = 0; i < birds.length; i++){
			birdsInStock = Integer.parseInt(birds[i][2]) - Integer.parseInt(birds[i][3]);
			if(birdsInStock < 3){
				lessThen3BirdType += birds[i][1] + " ";
			}
		}
		
		return lessThen3BirdType;
		
	}

}
