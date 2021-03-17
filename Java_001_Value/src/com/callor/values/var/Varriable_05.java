package com.callor.values.var;

public class Varriable_05 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		num1 = 33;
		num2 = 40;
		sum = num1 + num2;

		// 계산된 결과를 sum 변수에 담아두고 여러번 코드에서 값을 읽어 사용할 수 있다.
		System.out.printf("%d + %d = %d\n", num1, num2, sum);
		System.out.printf("%d과 %d를 덧셈한 결과는 %d\n", num1, num2, sum);
		System.out.printf("%d 더하기 %d 결과 %d\n", num1, num2, sum);
	}

}
