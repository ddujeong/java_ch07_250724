package exam;

//Animal 클래스를 만들고 Animal 클래스를 상속 받는 Dog, Cat, Tiger 클래스를 만드시오.
//bark() -> 오버라이딩

public class Animal {
	String type; // 종류
	String name; // 이름
	String color; // 색깔
	String sound; // 짖는소리
	
	
	
	public Animal(String type, String name, String color, String sound) {
		super();
		this.type = type;
		this.name = name;
		this.color = color;
		this.sound = sound;
	}

	public void ani() {
		System.out.println("종류 : " + type + "| 이름 : " + name + "| 색깔 : " + color);
	}

	public void bark() {
		System.out.println("짖는 소리 : " + sound);
	}
	
}
