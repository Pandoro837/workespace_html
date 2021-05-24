package com.javeex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double dR, dPi, dResult;
		
		dPi = 3.14;
		
		System.out.print("반지름 : ");
		
		dR = sc.nextDouble();
	
		dResult = (4.0 / 3.0) * (dPi * dR * dR * dR);
		
		System.out.println("구의 부피는 :" + dResult + "입니다.");
		
		sc.close();
		
	}
	
}
