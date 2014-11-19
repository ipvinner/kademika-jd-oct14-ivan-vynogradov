package Lesson6.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends AbstractShape {

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		System.out.println("Circle drawed");
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(3));
		
		g.setColor(new Color(255, 0, 0));
		g.drawOval(80, 80, 80, 80);
	}
	
	
	
}
