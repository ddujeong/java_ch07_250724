package com.ddu.ch07.part01;

public class Shape { // 부모 클래스
	int width;
	int height;
	String color; // 도형면의 색깔
	
	public double area() { // 도형의 면적
		int area = width* height;
		return area;
	}
	
	
}
