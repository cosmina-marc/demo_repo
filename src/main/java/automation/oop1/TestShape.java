package automation.oop1;

public class TestShape {

	public static void main(String[] args) {

		Shape shape = new Shape();
		Circle circle = new Circle();
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();

		System.out.println(circle.draw());
		// System.out.println(square);
		System.out.println(square.toString());

	}

}
