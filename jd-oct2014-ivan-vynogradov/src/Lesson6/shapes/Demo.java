package Lesson6.shapes;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable circle = new Circle();
		Drawable rectangle = new Rectangle();
		Drawable triangle = new Triangle();
		Drawable square = new Square();
//		circle.draw();
//		triangle.draw();
		Drawable[] shapes = {circle, rectangle, triangle, square};
		ShapesTemplate st = new ShapesTemplate(shapes);
	}

}
