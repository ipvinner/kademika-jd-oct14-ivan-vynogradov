package Lesson6.shapes;


import java.awt.Graphics;

public class Rectangle extends AbstractShape {
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		System.out.println("Rectangle drawed");
//		g.setFont();
		
		g.drawRect(0, 0, 30, 90);
	}
	
}
