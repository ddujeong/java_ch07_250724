package exam;

public class Circle extends Shape {

	public Circle(int width, int height, String color, int sides) {
		super(width, height, color, sides);
	}

	@Override
	public double area() {
		double area = Math.PI * (width*0.5) * (width*0.5);
		return area;
	}
	
	
}
