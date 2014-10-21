package Lesson4.Video19;

public class Laucher {

	public static void main(String[] args) {
		
		Tank t = new Tank("Black", 100, 4);
		
		System.out.println("Tank color: " + t.color + " maxSpeed: " + t.maxSpeed + " crew: " + t.crew);
	}

}
