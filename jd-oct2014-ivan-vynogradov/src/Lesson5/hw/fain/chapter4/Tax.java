package Lesson5.hw.fain.chapter4;

public class Tax {
	double grossIncome;
	String state;
	int depandents;
	
	Tax(double grossIncome, String state, int depandents){
		this.grossIncome = grossIncome;
		this.state = state;
		this.depandents = depandents;
		//System.out.println(“Preparing the tax data for customer #” + customerCounter);
	}

	public double calcTax() {
		double stateTax = 0;
		if (grossIncome < 30000) {
			stateTax = grossIncome * 0.05;
		} else {
			stateTax = grossIncome * 0.06;
		}
		return stateTax;
	}
}
