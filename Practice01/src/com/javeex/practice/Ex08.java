package com.javeex.practice;

public class Ex08 {
	
	public static void main(String[] args) {
		
//		int x,y = 0;			//x와 y를 모두 0으로 초기화
//		char grade = "A";		//문자 A를 grade에 대입
//		int salary = 2,000,000; //salary에 2,000,000을 대입
//		byte n = 1000;			//n에 1000을 대입
		
		int x = 0 , y = 0;		// x = 0, y = 0;으로 각각 값을 지정해주어야 한다
		char grade = 'A';		// char은 ''로 지정할 수 있다
		String salary = "2,000,000";
		int salary_1 = 2000000;
		// int에는 ,를 넣을 수 없으므로 String으로 자료형을 변경한다
		// 혹은 숫자로서 쓰여야한다면 ','을 제거하여 2000000으로 저장한다
//		byte n = 1000;	
// byte는 -128~127이상의 수를 저장할 수 없으므로, 그보다 큰 범위를 갖는
//		다른 정수형 자료형으로 바꿔주어야 한다(short, int, long 등)
		short n = 1000;
	
		System.out.println(x);
		System.out.println(y);
		
	}
}
