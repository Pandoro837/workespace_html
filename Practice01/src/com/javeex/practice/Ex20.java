package com.javeex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i500, i100, i50, i10, iResult;
		
		System.out.print("500원의 갯수 : ");
		i500 = sc.nextInt();
		
		System.out.print("100원의 갯수 : ");
		i100 = sc.nextInt();
		
		System.out.print("50원의 갯수 : ");
		i50 = sc.nextInt();
		
		System.out.print("10원의 갯수 : ");
		i10 = sc.nextInt();
		
		iResult = (i500 * 500) + (i100 * 100) + (i50 * 50) + (i10 * 10);
		
		System.out.println("동전의 총합은 " + iResult + "원 입니다.");
		
		sc.close();
		
	}
}
