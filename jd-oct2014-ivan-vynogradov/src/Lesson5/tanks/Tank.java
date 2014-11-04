package Lesson5.tanks;

import java.util.Random;

public class Tank {
	
	private int speed = 10;
	private int x;
	private int y;
	private Direction direction;
	private ActionField af;
	private BattleField bf;
	private Bullet bullet;
	
	public Tank(){
		
	}
	public Tank(ActionField af, BattleField bf){
		this(af, bf, 128, 512, Direction.UP);
	}
	
	public Tank(ActionField af, BattleField bf, int x, int y, Direction direction){
		this.af = af;
		this.bf = bf;
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public void turn(Direction direction) throws Exception{
		this.direction = direction;
		af.processTurn(direction);
	}
	
	public void move() throws Exception{
		af.processMove(this);
	}
	
	public void fire() throws Exception{
		Bullet bullet = new Bullet((x+25), (y+25), direction);
		af.processFire(bullet);
	}
	
	public void moveRandom() throws Exception{
//		Random r = new Random();
//		int i;
//		while (true) {
//			i = r.nextInt(5);
//			if (i > 0) {
//				this.setDirection(i);
//				this.move();
//			}
//		}
	}
	
	public void moveToQuadrant(int v, int h) throws Exception{
		String coordinates = af.getQuadrantXY(v, h);
		int separator = coordinates.indexOf("_");
		int y1 = Integer.parseInt(coordinates.substring(0, separator));
		int x1 = Integer.parseInt(coordinates.substring(separator + 1));

		if (x < x1) {
			while (x != x1) {
				this.setDirection(Direction.RIGHT);
				this.move();
			}
		} else {
			while (x != x1) {
				this.setDirection(Direction.LEFT);
				this.move();
			}
		}

		if (y < y1) {
			while (y != y1) {
				this.setDirection(Direction.DOWN);
				this.move();
			}
		} else {
			while (y != y1) {
				this.setDirection(Direction.UP);
				this.move();
			}
		}
	}
	
	public void clean() throws Exception {
		for(int i = 0; i <= 8; i++){
			moveToQuadrant((9 - i), (1 + i));
			turn(Direction.UP);
			
			Bullet bullet = new Bullet((x+25), (y+25), direction);
			System.out.println("clean bulletY" + bullet.getY() );
			while(bullet.getY() != -14){
				System.out.println("here&");
				System.out.println("clean BulletY: " + bullet.getY());
				af.processFire(bullet);
			}
			turn(Direction.RIGHT);
			while(bullet.getX() != 590){
				//System.out.println("clean BulletX: " + bulletX);
				af.processFire(bullet);
			}
			
		}
	}
	
	public void destroy(){
		this.x = -100;
		this.y = -100;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public void updateX(int x){
		this.x += x;
	}
	
	public void updateY(int y){
		this.y += y;
	}
}
