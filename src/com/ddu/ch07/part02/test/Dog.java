package com.ddu.ch07.part02.test;

public class Dog extends Animal {
	int age; //강아지 나이

	@Override
	public void sound() { // 메소드 오버라이딩
		System.out.println("멍멍");
	}

	
}
