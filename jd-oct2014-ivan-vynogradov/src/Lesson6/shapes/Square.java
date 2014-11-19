package Lesson6.shapes;

import java.awt.Graphics;

public class Square extends Rectangle {

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.fillRect(150, 150, 40, 40);
	}
	
}
