package com.ddu.ch07.part01;

public class Triangle extends Shape {

	@Override
	public double area() {
		double area =(width* height)/2;
		return area;

	}
	
	
	
//	public double area() { 
//		double area =(width* height)/2;
//		return area;
		// 메소드 오버라이딩
		// -> 부모클래스의 메소드를 자식 클래스에 맞춰 재정의
// }

}
