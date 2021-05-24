package com.javeex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double dFtemp, dCtemp;
		
		System.out.print("화씨 : ");
		dFtemp = sc.nextDouble();
		
		dCtemp = (5.0 / 9.0) * (dFtemp - 32);
		System.out.println("화씨 " + dFtemp +"°F의 섭씨 온도는 " + dCtemp + "°C 입니다.");
		
		
		sc.close();
		
	}
	
}
