package com.ddu.ch07.part02;


public class MainClass {

	public static void main(String[] args) {
		
		double a; // 8 byte
		int b = 10; // 4 byte
		a = b; // 자동 형변환
		b = (int) a; // 강제 형변환 -> double 이 더 커서 자동형변환 XX
		
		String c = "100";
		Integer.parseInt(c); // 문자열을 정수로 변환

		Person person = new Person();
		Student student = new Student();
		Soldier soldier = new Soldier();
		
		person = student; // -> 참조 가능 (자동 형변환)
		// 자식클래스가 더 큰 영역(student + person) 
		// 부모클래스는 더 작은 영역(person)
		// 부모눈 자식의 모든걸 받아준다??!!(부모와 자식 관계에만 적용가능)
		// student = person; -> 참조 불가능
		student = (Student) person; // (강제 형변환)
		// soldier = person; -> 참조 불가능 
		// soldier = student; -> 참조 불가능
		// soldier = (Soldier) student; -> 강제 형변환도 안됨 XXXX 
		
		
		Person person2 = new Student();
		// person = student; 와 같은 말
		person2 = new Soldier();
	
		System.out.println("==================================================");
		
		Car myCar = new Car();
		
		myCar.carName = "소나타";
		myCar.year = 2010;
		
		myCar.rearTire = new HankookTire();
		myCar.frontTire =  new KumhoTire();
	
		HankookTire hanTire = new HankookTire();
		KumhoTire kumTire = new KumhoTire(); 
		
		myCar.tirePrint(hanTire);
		myCar.tirePrint(kumTire);
		// 매개변수의 다형성
	}

}
