package com.callor.var;

/*
 * 1. 정수형 변수 num1, num2를 선언
 * 2. 각각 33과 55를 저장하라
 * 3. 각 변수에 담긴 값을 4칙연산을 수행하고 sum, minus, times, div 변수에 각각 저장하라
 */

public class Varriable_01 {
	
	public static void main(String[] arg) {
		
		// Integer
		// 정수값을 저장할 기억장치를 예약하고 그곳에 num1, num2 이름(별명)을 붙여달라
		// 정수형 변수 num1, num2를 선언하고 각각 변수에 정수 33, 정수 55를 저장하라
		// num1, num2 변수는 사용할 준비가 된다 => 초기화 되었다 => 생성되었다
		int num1 = 33;
		int num2 = 55;
		int sum;
		int minus;
		int times;
		int div;
		
		sum = num1 + num2;
		minus = num2 - num1;
		times = num1 * num2;
		div = num2 / num1;
		
		System.out.println("===========================");
		System.out.printf("숫자 %d와 %d의 사칙연산\n", num1, num2);
		System.out.println("---------------------------");
		System.out.printf("%d + %d = %4d\n", num1, num2, sum);
		System.out.printf("%d - %d = %4d\n", num2, num1, minus);
		System.out.printf("%d x %d = %4d\n", num1, num2, times);
		System.out.printf("%d / %d = %4d\n", num2, num1, div);
		System.out.println("===========================");
		
	}

}
