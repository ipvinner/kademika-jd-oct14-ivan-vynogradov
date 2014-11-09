package Lesson5.hw.fain.chapter3;

public class NJTax extends Tax {
	double adjustForStudents (double stateTax){
		double adjustedTax = stateTax - 500;
		return adjustedTax;
		}
}
