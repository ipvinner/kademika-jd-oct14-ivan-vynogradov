package Lesson5.hw.fain.chapter3;

public class TestCalc {
	public static void main(String[] args){
		Tax t = new Tax();
		t.grossIncome= 50000; // assigning the values
		t.depandents = 2;
		t.state= "NJ";
		
		double yourTax = t.calcTax(); //calculating tax
		
		System.out.println("your tax is " + yourTax);
		
		NJTax t1 = new NJTax();
		double yourTax1 = t1.calcTax();
		double totalTax = t1.adjustForStudents(yourTax);
		System.out.println("NJ tax is " + totalTax);
	}
}
