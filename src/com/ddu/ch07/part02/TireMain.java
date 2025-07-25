package com.ddu.ch07.part02;

public class TireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tire tire;
		tire = new KumhoTire(); // 자동 형변환 -> upcasting
		// ==>  Tire tire = new KumhoTire();
		// 자동형변환은 가능하나 자식클래스의 객체나 매소드는 불러올수 없음
		
		
		// tire.tireCompanyKumho
		// 자식 필드인 tireCompanyKumho는 사용불가.
		
		
		KumhoTire kumho2;
		kumho2 = (KumhoTire)tire; // 강제형변환 -> downcasting
		
		kumho2.tirename = "스노우 타이어";
		// 부모 필드 사용가능
		
		
		
		// 업캐스팅, 다운캐스팅 알아보세요
	}

}
