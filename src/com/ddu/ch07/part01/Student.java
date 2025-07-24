package com.ddu.ch07.part01;

public class Student extends Person { // 자식클래스
	int grade; // 학년

	public Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}


	//	
//	public Student(String name, int grade) {
//		super(name); // 부모 생성자를 호출하면서 name 값을 필드로 넘겨줌
//		this.grade = grade;
//	}
	
	// 부모클래스에 기본생성자가 없는 상태라서 자식클래스에서 name 값을 받아 넘겨줌
}
