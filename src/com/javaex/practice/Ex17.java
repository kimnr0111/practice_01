package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double radius, circle;
		System.out.print("반지름: ");
		radius = sc.nextDouble();
		circle = (double)4/(double)3*3.14*(radius*radius*radius);
		System.out.println("구의부피는: " + circle + " 입니다.");

	}

}
