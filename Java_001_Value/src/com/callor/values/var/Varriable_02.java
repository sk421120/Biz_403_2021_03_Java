package com.callor.values.var;

public class Varriable_02 {
	
	public static void main(String[] arg) {
		
		/*
		 * 변수의 선언
		 * 변수는 사용(저장, 읽기)하기 전에 반드시 선언
		 * 
		 * 선언키워드 변수명;
		 * 
		 * 어떤 기억장소에 값을 저장할 수 있도록 예약하는 절차
		 */
		int example;
		
		/*
		 * 이미 선언된 변수이름은 같은 이름으로 또다시 선언할 수 없다.
		 */
		// int example;
		
	
		// int == Integer == 정수
		int num1 = 150;
		int num2 = 250;
		
		num1 = 300;
		num2 = 400;
		
		System.out.printf("%d과 %d의 +, -, x, /, MOD 연산 결과\n", num1, num2);
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
	}

}
