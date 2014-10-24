package Lesson4.tanks;

public class Bullet {

	private int speed = 10;
	private int x;
	private int y;
	private int direction;
	
	public Bullet(){
		
	}
	
	public Bullet(int x, int y, int direction){
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public int getX() {
		return x;
	}

	
	public int getY() {
		return y;
	}

	
	public int getDirection() {
		return direction;
	}

	
	public void updateX(int x) {
		this.x = x + 25;
	}

	public void udpateY(int y) {
		this.y = y + 25;
	}

	public void destroy() {
		this.x = -100;
		this.y = -100;
	}

}
