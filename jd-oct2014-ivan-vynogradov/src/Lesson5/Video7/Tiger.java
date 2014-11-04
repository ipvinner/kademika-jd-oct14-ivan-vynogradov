package Lesson5.Video7;

public class Tiger extends Tank {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tiger to String";
	}
	
	@Override
	public void move() {
		System.out.println(getClass().getName() + "move");
	}
}
