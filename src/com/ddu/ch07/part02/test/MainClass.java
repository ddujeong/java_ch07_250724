package com.ddu.ch07.part02.test;


public class MainClass {
	public static void main(String[] args) {
	
		
	//********************Upcasting********************	
	Animal animal =  new Dog(); // upcasting
	animal.name = "똘똘이";
	// animal.age =4;  -> error (자식 클래스의 필드에 접근 불가)
	
	animal.sound();
	// 멍멍
	// 필드에는 접근할 수 없지만 오버라이딩 된 메서드 출력 (메서드는 별개의 영역임) 
	// 동적 바인딩
	
	
	//********************Downcasting********************	
	Dog dog;
	dog = (Dog) animal; //downcasting
	dog.age = 10;
	dog.name = "멍멍이";
	dog.sound();
	// 멍멍
	// 오버라이딩 된 메서드 출력
	
	//*************Upcasting과 downcasting 자식 접근 연습*************
	Animal animal3 = new Cat(); //upcasting
	Cat cat = (Cat) animal3; // downcasting
	cat.eat();
	// 야옹하면서 사료먹기
	// 자식 메서드 접근 가능
	
	Dog dog3;
	//downcasting 할때 instanceof 연산자로 확인 후 downcasting  진행하면 안전하게 가능
	if (animal instanceof Dog) { //true -> animal이 Dog 클래스로 만든 객체를 참조하고 있다는 것을 확인
		dog3 = (Dog) animal;
		dog3.sound();
	}
	//********************Error********************
	Animal animal2 = new Animal();
	// 인스턴스화 -> 실제 객체가 Animal 클래스로 만들어 짐
	// -> 이 경으에는 강제 형변환 안됨
	//Dog dog2 = (Dog) animal2;
	// ClassCastException (error)
	

	
	// Animal animal3 = new Cat();
	// animal3.eat(); -> error (자식 메서드 접근불가 ) 
	}
}

// 수정하세요