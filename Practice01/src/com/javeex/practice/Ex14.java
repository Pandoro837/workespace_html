package com.javeex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double dWidth, dHeight;
		
		System.out.print("가로를 입력하세요 : ");
		dWidth = sc.nextDouble();
		System.out.print("세로를 입력하세요 : ");
		dHeight = sc.nextDouble();
		
		System.out.println("사각형의 넓이는 "+ dWidth * dHeight);
		System.out.println("사각형의 둘레는 "+ (dWidth * 2 + dHeight * 2));
		
		sc.close();
		
	}
}
