package com.javaex.practice;

public class Ex03 {
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2; //a=4	x=2
		int b = y++ *2; //b=2	y=2
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}