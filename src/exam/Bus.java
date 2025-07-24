package exam;

public class Bus extends Car {
	int max;

	public Bus(String name, String type, String color, int tire, int door, int max) {
		super(name, type, color, tire, door);
		this.max = max;
	
	}
	@Override
	public void carType() {
		System.out.println("차종 : " + name +"| 구동방식 : " + type + "차" + "| 색상 : " + color +"| 타이어 갯수 : " + tire +" 개 "
							+ "| 문 갯수 : " + door + " 개" + "| 최대 인원 : " + max + " 인승");
	}
}
