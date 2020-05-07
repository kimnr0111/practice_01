package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요: ");
		int pay = sc.nextInt();
		int year = pay * 12 * 10;
		
		System.out.println("10년동안 최대 저축액은 " + year + "원 입니다.");

	}

}
