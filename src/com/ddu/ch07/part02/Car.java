package com.ddu.ch07.part02;

public class Car { 
	
	// 필드
	String carName;
	int maxSpeed;
	int year;
	int price;
	
	// Tire fronttire = new KumhoTire(); // 앞바퀴 = 금호
	// Tire reartire = new HankookTire(); // 뒷바퀴 = 한국
	
	Tire frontTire;
	Tire rearTire;
	// KumhoTire frontTire;
	// HankookTire rearTire;
	// 가능은 하나 유연성이 떨어짐
	// 타이어 클래스의 자식 클래스가 추가 되었을때 코드를 다 수정해야함
	
	// 매개 변수에 인수로 금호타이어 객체가 들어오면 -> 금호 , 한국타이어 객체가 들어오면 -> 한국 으로 툴력해주는 메소드
	public void tirePrint(Tire tire) {
		// 타이어의 이름 출력 해주는 매서드
		tire.tireName();
	}
	
}
