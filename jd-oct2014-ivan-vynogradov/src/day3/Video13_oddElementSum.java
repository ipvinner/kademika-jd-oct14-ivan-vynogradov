package day3;

public class Video13_oddElementSum {

	public static void main(String[] args) {
		
		int[] data = {1,2,3,4,5};
		
		System.out.println(oddElementSum(data));

	}
	
	static long oddElementSum(int[] data){
		
		long sum = 0;
		
		if(data != null){
			for(int i = 1; i < data.length; i+=2){
				sum += data[i];
			}
			return sum;
		}else{
			return -1;
		}
		
		
	}

}
