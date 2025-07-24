package exam;

public class Triangle extends Shape {
	
	int ver; // 꼭짓점 갯수

	public Triangle(int width, int height, String color, int sides, int ver) {
		super(width, height, color, sides);
		this.ver = ver;
	}

	@Override
	public double area() {
		double area = width * height* 0.5;
		return area;
	}
	
	
	
}
