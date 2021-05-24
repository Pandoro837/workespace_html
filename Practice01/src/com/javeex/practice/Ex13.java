package com.javeex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int iWon;
		
		System.out.print("환전할 원화를 입력하세요 : ");
		
		iWon = sc.nextInt();
		
		final double dDollar = iWon / 1230.95 ;
		
		System.out.println("받으실 달러는 : "+ dDollar);
		
		sc.close();
		
	}
}
