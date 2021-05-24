package com.javeex.practice;

public class Ex06 {
	
	public static void main(String[]args) {
		
		int i = 10;
		int n = i++ % 2;		//이 시점에서 i의 값은 11
		
		System.out.println(i);	//10 , 오답 / i의 값이 n = i++ % 2로 정의된 시점에서 +1되어 11이 되어있음
		System.out.println(n);	//0 ,	여기서 i의 값은 맨 위의 10의 값이며, 10 %2의 나머지가 0이므로
		
		
	}
}
