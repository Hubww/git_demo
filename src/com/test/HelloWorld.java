package com.test;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ww ="hello world";
		String ww1 = "hello"+new String(" world");
		String ww2 = "hello world";
		String ww3 = "hello"+" world";
		String ww4 = "hello world"+new String("");
		System.out.println(ww.equals(ww1));
		System.out.println(ww==ww1);
		System.out.println(ww==ww2);
		System.out.println(ww==ww3);
		System.out.println(ww==ww4);
	}

}
