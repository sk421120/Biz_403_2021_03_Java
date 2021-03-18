package com.callor.var;

public class Varriable_20 {

	public static void main(String[] args) {
		
		int intKor = 91;
		int intEng = 82;
		
		int intSum = intKor + intEng;
		
		System.out.printf("%d + %d = %d\n", intKor, intEng, intSum);
		
		float avg = (float)intSum / 2;
		System.out.printf("평균 : %3.2f\n", avg);
	}
}
