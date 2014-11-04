package Lesson5.Video23;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(darkZone(1000, 12, 10000000));
	}
	
	public static int darkZone(int monthlyPayment, int interest, int dreamSum){
		int monthsBeforeDream = 0;
		int sum = monthlyPayment;
		int monthInterest = (monthlyPayment*interest/100)/12;
		while(sum < dreamSum){
			//System.out.println("interest" + getInterest(sum, interest));
			sum += monthlyPayment + getInterest(sum, interest);
			//System.out.println("Sum: " + sum);
			
			monthsBeforeDream++;
		}
		
		return monthsBeforeDream/12;
	}
	
	public static int getInterest(int sum, int interest){
		return (sum*interest/100)/12;
	}

}
