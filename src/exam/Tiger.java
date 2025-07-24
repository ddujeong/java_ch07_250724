package exam;

public class Tiger extends Animal {
	boolean flag;

	public Tiger(String type, String name, String color, String sound, boolean flag) {
		super(type, name, color, sound);
		this.flag = flag;
	}

	@Override
	public void ani() {
		System.out.println("종류 : " + type + "| 이름 : " + name + "| 색깔 : " + color + "| 위험한가? : " + flag);

	}
	
	
	

}
