package com.javeex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double dKilo = 1.609;
		double dMile;
		
		System.out.print("마일을 입력하세요 : ");
		dMile = sc.nextDouble();
		
		System.out.println(dMile + "마일은 " + (dMile * dKilo) + "킬로미터 입니다");
		
		sc.close();
		
	}
}
