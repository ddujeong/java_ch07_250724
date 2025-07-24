package com.ddu.ch07.part01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		rectangle.height = 10;
		rectangle.width = 20;
	System.out.println("============================");
	
	Dog dog1 = new Dog();
	Dog dog2 = new Dog("멍멍", 10);
	System.out.println("============================");
	
	Student student  =new Student("홍길동", 22, 3);
	System.out.println("============================");
	
	Triangle triangle = new Triangle();
	triangle.width = 10;
	triangle.height = 5;
	triangle.color = "red";
	
	
	// 삼각형의 면적
	System.out.println(triangle.area());
	// 25.0 
	// -> double area =(width* height)/2;
	// 오버 라이딩(매소드 재정의) 된 것 
	
	Rectangle rectangle2 = new Rectangle();
	rectangle2.width = 10;
	rectangle2.height = 20;
	
	
	// 사각형의 면적
	System.out.println(rectangle2.area());
	// 200.0
	// -> int area = width* height;

	} 

}
