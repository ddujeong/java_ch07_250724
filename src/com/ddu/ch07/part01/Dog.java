package com.ddu.ch07.part01;

public class Dog extends Animal {
	String dogTail;
	String color;
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, int age, String sound, int legCount) {
		super(name, age, sound, legCount);
		// TODO Auto-generated constructor stub
	}
	public Dog(String sound, int legCount) {
		super(sound, legCount);
		// TODO Auto-generated constructor stub
	}
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void dogRun() {
		System.out.println("강아지 달리기");
	}
	
}
