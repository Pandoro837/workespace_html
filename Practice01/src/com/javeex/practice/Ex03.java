package com.javeex.practice;

public class Ex03 {
	
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int a = ++x * 2;
		int b = y++ * 2;
		
		System.out.println("a=" + a);
//		a는 ++x이므로, x의 값이 2가 된 상태에서 *2가 되어 4가 된다
		System.out.println("b=" + b);
//		b는 y++이므로, y의값이 1인상태에서 *2가되어 2가 된다
//		이후 y의 값은 2가 된다
		System.out.println("x=" + x);
//		x는 ++x 이후의 값이 되었으므로 2가 된다
		System.out.println("y=" + y);
//		y는 y++ 이후의 값으로, 2가 된다
	}
	
}
