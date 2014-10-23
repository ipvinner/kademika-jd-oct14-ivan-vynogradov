package Lesson4.Video14;

public class Laucher {

	public static void main(String[] args) {
		
		Tank tank1 = new Tank();
		tank1.color = "black";
		tank1.crew = 2;
		tank1.maxSpeed = 200;
		printTankInfo(tank1);
	}
	
	static void printTankInfo(Tank tank1){
		
		System.out.println("color: " + tank1.color);
		System.out.println("crew: " + tank1.crew);
		System.out.println("maxSpeed: " + tank1.crew);
		
	}

}
