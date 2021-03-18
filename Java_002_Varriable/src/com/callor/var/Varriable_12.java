package com.callor.var;

public class Varriable_12 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		intNum += 100;
		System.out.println(intNum);
		// 100
		
		intNum += 33;
		System.out.println(intNum);
		// 133
		
		intSum += intNum;
		System.out.println(intSum);
		// 133
		
		intSum += intNum;			// 133 + 133
		System.out.println(intSum);
		// 266
		
		intSum += intNum;			// 133 + 133 + 133
		intSum += intNum;			// 133 + 133 + 133 + 133
		
		intSum = 0;
		// 0 + 1 + 2 + 3 + 4 + 5 > intSum에 저장
		// intSum = intSum + 1 + 2 + 3 + 4 + 5; 
		//
		// intSum = intSum + 1;		A코드
		// intSum = intSum + 2;		B코드
		// intSum = intSum + 3;		.
		// intSum = intSum + 4;		.
		// intSum = intSum + 5;		.
		//
		// intNum = 1;
		// intSum = intSum + intNum;		A코드 같음
		// intSum = intSum + (++intNum);	B코드 같음
		// intSum = intSum + (++intNum);		.
		// intSum = intSum + (++intNum);		.
		// intSum = intSum + (++intNum);		.
		
	}
}
