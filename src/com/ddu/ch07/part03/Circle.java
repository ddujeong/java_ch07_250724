package com.ddu.ch07.part03;

public class Circle extends Shape{
	private double r;
	// public static final double PI =3.141591;
	
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Circle(double r) {
		super();
		this.r = r;
	}


	public double getR() {
		return r;
	}


	public void setR(double r) {
		this.r = r;
	}


	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}


	@Override
	public void getColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("사각형 색깔: "+ color);
		
	}

}
