package day3;

public class Video26_getPopulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] data = {{"China", "Pekin", "1367290000"}, {"India", "Deli", "1260930000"}, {"United States", "Vashington", "1260930000"}};
		System.out.println(getPopulation(data));
	}
	
	static long getPopulation(String[][] data){
		long sum = 0;
		
		for(int i =0; i < data.length ; i++){
			long pop = Long.valueOf(data[i][2]);
			sum +=pop;
		}
		return sum;
		
	}
	
}
