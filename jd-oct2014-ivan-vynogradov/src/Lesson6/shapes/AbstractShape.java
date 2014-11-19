package Lesson6.shapes;

import java.awt.Color;
import java.awt.Graphics;

public abstract class AbstractShape implements Drawable {
	
	protected Color color;
	
	public Color getColor(){
		return color;
	}
}
