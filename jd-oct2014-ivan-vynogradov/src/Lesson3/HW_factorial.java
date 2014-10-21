package Lesson3;

public class HW_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		System.out.println(factorial(2));
		System.out.println(factorial(0));
	}
	
	static long factorial(int i){
		long result = 1;
		if(i > 0){
			for(int j = 1; j <= i; j++){
				//System.out.println(j);
				result *= j;
				//System.out.println(result);
			}
		return result;
		}		
		
		return result;
	}
}
