package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double f, c;
		System.out.print("화씨: ");
		f = sc.nextDouble();
		c = (double)5/9 * (f - 32.0);
		System.out.println("화씨 " + f + " 의 섭씨온도는 " + c + " 입니다.");
		System.out.print("섭씨: ");
		c = sc.nextDouble();
		f = (c * (double)9/(double)5) + 32;
		System.out.println("섭씨 " + c + " 의 화씨온도는 " + f + " 입니다.");
	}

}
