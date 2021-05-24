package com.javeex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final float fPi = 3.14F;
		float fR;
		
		System.out.print("반지름을 입력하세요 :");
		fR = sc.nextFloat();
		System.out.println("원의 넓이는 :"+ fPi * fR * fR);
		
		sc.close();
		
	}
}
