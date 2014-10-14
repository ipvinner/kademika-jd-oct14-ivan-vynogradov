package day3;

public class Video15_AverageForeach {

	public static void main(String[] args) {
		
		int[] data = {1,2,3,4,24};
		
		System.out.println(average(data));
		System.out.println(average(new int[] {5,20,13,18,46}));
		
	}
	
	static double average(int[] data){
		
		double avg = 0;
		
		if(data != null){
			for(int i: data){
				avg += i;
			}
			return avg/data.length;
		}else{
			return -1;
		}
		
	}
	
}
