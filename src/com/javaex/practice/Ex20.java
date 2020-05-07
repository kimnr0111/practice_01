package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int won_500, won_100, won_50, won_10;
		System.out.print("500원 개수: ");
		won_500 = sc.nextInt();
		System.out.print("100원 개수: ");
		won_100 = sc.nextInt();
		System.out.print("50원 개수: ");
		won_50 = sc.nextInt();
		System.out.print("10원 개수: ");
		won_10 = sc.nextInt();
		int result;
		result = won_500*500 + won_100*100 + won_50*50 + won_10*10;
		System.out.println("동전의 총합은 " + result + "원 입니다.");

	}

}
