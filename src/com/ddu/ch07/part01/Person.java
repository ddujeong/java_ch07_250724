package com.ddu.ch07.part01;

public class Person { // 부모클래스
	String name; // 이름
	int age;
//	
//	public Person() {
//	
//	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 기본생성자가 없는 상태
	// 기본생성자를 불러오면 자식클래스에서 값을 받지 않아도 됨 
}
