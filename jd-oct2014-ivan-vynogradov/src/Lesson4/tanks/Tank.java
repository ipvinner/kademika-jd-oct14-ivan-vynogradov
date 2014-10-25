package Lesson4.tanks;

import java.util.Random;

public class Tank {
	
	private int speed = 10;
	private int x;
	private int y;
	private int direction;
	private ActionField af;
	private BattleField bf;
	
	public Tank(){
		
	}
	public Tank(ActionField af, BattleField bf){
		this(af, bf, 128, 512, 1);
	}
	
	public Tank(ActionField af, BattleField bf, int x, int y, int direction){
		this.af = af;
		this.bf = bf;
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public void turn(int direction) throws Exception{
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
		Random r = new Random();
		int i;
		while (true) {
			i = r.nextInt(5);
			if (i > 0) {
				this.setDirection(i);
				this.move();
			}
		}
	}
	
	public void moveToQadrant(int v, int h) throws Exception{
		String coordinates = af.getQuadrantXY(v, h);
		int separator = coordinates.indexOf("_");
		int y1 = Integer.parseInt(coordinates.substring(0, separator));
		int x1 = Integer.parseInt(coordinates.substring(separator + 1));

		if (x < x1) {
			while (x != x1) {
				this.setDirection(4);
				this.move();
			}
		} else {
			while (x != x1) {
				this.setDirection(3);
				this.move();
			}
		}

		if (y < y1) {
			while (y != y1) {
				this.setDirection(2);
				this.move();
			}
		} else {
			while (y != y1) {
				this.setDirection(1);
				this.move();
			}
		}
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
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public void updateX(int x){
		this.x += x;
	}
	
	public void updateY(int y){
		this.y += y;
	}
}
