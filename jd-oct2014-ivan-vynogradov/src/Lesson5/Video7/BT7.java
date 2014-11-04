package Lesson5.Video7;

public class BT7 extends Tank {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BT7 to string";
	}
	
	@Override
	public void move() {
		System.out.println(getClass().getName() + " move");
	}
}
