package exam;

public class Car {
	//1.  Car 클래스를 만들고, Car 클래스를 상속 받는 Truck, SportsCar, Bus 클래스를 만드시오. 
	String name; // 차종
	String type; // 구동방식
	String color; // 색상
	int tire; // 타이어 갯수
	int door; // 문 갯수
	
	public Car(String name, String type, String color, int tire, int door) {
		super();
		this.name = name;
		this.type = type;
		this.color = color;
		this.tire = tire;
		this.door = door;
	}

	public void carType() {
		System.out.println("차종 : " + name +" 구동방식 : " + type + "차" + " 색상 : " + color +" 타이어 갯수 : " + tire +" 개" + " 문 갯수 : " + door + " 개");
	}
	
}
