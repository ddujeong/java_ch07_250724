package com.ddu.ch07.part03.test;

public abstract class Person {
    String name;
    static String Hi;
    
    public Person(String name) {
        this.name = name;
    }
    public static void printHi() {
		System.out.println("안녕하세요. 반갑습니다!");
	}
    abstract void sayHello();
}

