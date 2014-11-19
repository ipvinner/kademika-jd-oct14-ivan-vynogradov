package Lesson6.shapes;

import java.awt.Graphics;

public class Shape {
	
	public void draw(Graphics g){
		//System.out.println("Shape is drawing");
		throw new IllegalStateException("I don't know how to paint shape, please override me!");
	}
	
	public void calculateArea(){
		
	}

}
