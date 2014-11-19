package Lesson6.tanks;

public class Bullet {

	private int speed = 5;
	private int x;
	private int y;
	private Direction direction;
	
	public Bullet(){
		
	}
	
	public Bullet(int x, int y, Direction direction){
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public int getX() {
		return x;
	}

	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getY() {
		return y;
	}

	
	public Direction getDirection() {
		return direction;
	}

	
	public void updateX(int x) {
		System.out.println("Update x");
		//this.x = x + 25;
		this.x += x;
		
	}

	public void updateY(int y) {
		//this.y = y + 25;
		System.out.println("Update y");
		this.y += y;
	}

	public void destroy() {
		this.x = -100;
		this.y = -100;
	}

}
