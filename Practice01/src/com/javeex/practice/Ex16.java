package com.javeex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float fPrice, fMoney, fTax;
		
		
		System.out.print("상품가격 : ");
		fPrice = sc.nextInt();
		
		System.out.print("받은 돈 : ");
		fMoney = sc.nextInt();
		
		fTax = fPrice * 0.1F;
		
		System.out.println("=====================");
		
		System.out.println("받은 돈 :" + fMoney + "원");
		
		System.out.println("상품 가격 : " + fPrice + "원");
		
		System.out.println("부가세 : " + fTax +"원");
		
		System.out.println("잔액 : " + (fMoney - (fPrice+fTax)));
		
		sc.close();
		
	}
}
