package Lesson4.hw;

public class Car {
	
	private String color;
	private double speed;
	private double engine;
	private String vendor;
	private int displacement;
	
	public static void main(String[] args) {
		
	}
	
	public boolean isManCar(){
		if(color.equals(Color.BLACK)){
			return true;
		}else {
			return false;
		}
	}
	
	public void run(){
		System.out.println("car run");
	}
	
	public void beep(){
		System.out.println("car beep");
	}
	
	public void turn(){
		System.out.println("car turn");
	}

}
