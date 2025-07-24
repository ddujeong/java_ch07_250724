package exam;

public class Truck extends Car {
	String use;

	public Truck(String name, String type, String color, int tire, int door, String use) {
		super(name, type, color, tire, door);
		this.use = use;
	}

	@Override
	public void carType() {
		System.out.println("차종 : " + name +"| 구동방식 : " + type + "차" + "| 색상 : " + color +"| 타이어 갯수 : " + tire +" 개"
							+ "| 문 갯수 : " + door + " 개" + "| 용도 : " + use);
	}
		
}
