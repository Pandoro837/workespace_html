package com.javeex.practice;

public class Ex09 {
	
	public static void main(String[] args) {
		
		double dF = 80.0 ;
		
		System.out.println(5.0 / 9.0 * (dF - 32.0));
		
		double x = 5; double y = 9;
		
		System.out.println(x / y * (dF - 32.0));
		
		// 자료형이 지정되지 않은 5와 9는 기본적으로 정수형으로 저장된다
		// 정수형 간의 연산은 정수형으로 저장되므로, 5/9는 0.555- 가 아니라 0으로 계산된다
		// 따라서 각 정수를 실수형인 5.0, 9.0으로 저장하거나, double x = 5; double y = 9;으로
		// 각 값을 실수로 지정해주면 올바른 연산이 진행된다
		
	}
}
