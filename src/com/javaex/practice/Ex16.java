package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double price, pay, vat, changes;
		int select;
		System.out.println("1.상품구매 2.나가기");
		select = sc.nextInt();
		while(select==1)
		{
			System.out.print("상품가격: ");
			price = sc.nextInt();
			System.out.print("받은돈: ");
			pay = sc.nextInt();
			System.out.println("==========================");
			vat = price/10;
			changes = pay - price - vat;
			if(changes<0)
			{
				System.out.println("잔액이 부족합니다.");
			}
			else
			{
				System.out.println("상품가격: " + price);
				System.out.println("받은돈: " + pay);
				System.out.println("부가세" + vat);
				System.out.println("잔액 " + changes);
			}
			System.out.println("1.상품구매 2.나가기");
			select = sc.nextInt();
		}

		
	}


}
