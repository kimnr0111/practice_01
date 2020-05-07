package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ %2;
		
		System.out.println(i); //10 + 1 = 11
		System.out.println(n); //연산자가 i 뒤에 붙으므로 값을 대입한 다음 증가 10%2 = 0
	}
}
