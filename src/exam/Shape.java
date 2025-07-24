package exam;
// Shape 클래스를 만들고, Shape 클래스를 상속 받는 Rectangle, Triangle, Circle 클래스를 만드시오.
//(면적 계산 메소드가 존재해야 하며, 메소드 오버라이딩을 적용하시오.)

public class Shape {
	int width; // 가로
	int height; // 세로
	String color; // 색깔
	int sides; // 변 갯수
	
	public Shape(int width, int height, String color, int sides) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
		this.sides = sides;
	}
	

	public double area() {
		double area = width * height;
		return area;
	} 
}
