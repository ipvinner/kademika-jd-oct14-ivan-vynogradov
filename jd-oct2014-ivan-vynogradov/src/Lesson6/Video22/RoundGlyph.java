package Lesson6.Video22;

public class RoundGlyph extends Glyph {
	private int radius = 5;
	
	public RoundGlyph(int radius){
		System.out.println("RoundGlyphp#constructor");
		draw();
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("RoundGlyph#draw()");
		System.out.println("RoundGlyph [radius: " + radius + "]");
	}
	
	
}
