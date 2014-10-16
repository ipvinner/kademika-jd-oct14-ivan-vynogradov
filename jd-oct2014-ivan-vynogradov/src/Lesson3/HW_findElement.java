package Lesson3;

public class HW_findElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = {2.0, 3.0, 5.0, 6, 4.2};
		
		System.out.println(findElement(numbers, 40));
		
	}
	
	static int findElement(double[] numbers, double element){
		
		for(int i =0; i < numbers.length; i++){
			if(element == numbers[i]){
				return i;
			}
		}
		
		return -1;
		
		
	}

}
