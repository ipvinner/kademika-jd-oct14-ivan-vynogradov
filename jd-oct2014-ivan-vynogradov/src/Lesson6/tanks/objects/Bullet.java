package Lesson6.tanks.objects;

import java.awt.Color;
import java.awt.Graphics;

import Lesson6.shapes.Drawable;
import Lesson6.tanks.enums.Direction;
import Lesson6.tanks.objects.abstractobjects.Destroyable;

public class Bullet implements Drawable, Destroyable {

	private int speed = 5;
	private int x;
	private int y;
	private Direction direction;
	private boolean bulletOwner; //true is deffender, false is aggressor
	
	public Bullet(int x, int y, Direction direction){
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public void updateX(int x) {
		this.x += x;
	}

	public void updateY(int y) {
		this.y += y;
	}
	
	public void destroy() {
		x = -100;
		y = -100;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public Direction getDirection() {
		return direction;
	}

	public boolean getBulletOwner() {
		return bulletOwner;
	}

	public void setBulletOwner(boolean bulletOwner) {
		this.bulletOwner = bulletOwner;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(255, 255, 0));
		g.fillRect(this.getX(), this.getY(), 14, 14);
		
	}
	
	
	
	

	

}
