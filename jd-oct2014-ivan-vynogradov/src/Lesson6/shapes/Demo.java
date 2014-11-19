package Lesson6.shapes;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		Square square = new Square();
//		circle.draw();
//		triangle.draw();
		Shape[] shapes = {circle, rectangle, triangle, square};
		ShapesTemplate st = new ShapesTemplate(shapes);
	}

}
