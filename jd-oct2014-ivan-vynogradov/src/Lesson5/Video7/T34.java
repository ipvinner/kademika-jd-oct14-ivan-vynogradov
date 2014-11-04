package Lesson5.Video7;

public class T34 extends Tank{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "T34 to string";
	}
	
	@Override
	public void move() {
		System.out.println(getClass().getName() + "move");
	}
}
