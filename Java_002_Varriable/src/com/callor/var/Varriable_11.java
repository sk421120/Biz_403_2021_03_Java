package com.callor.var;

public class Varriable_11 {

	public static void main(String[] args) {
		
		int intNum = 0;	// intNum++ : 0 부터 시작		++intNum : 1 부터 시작
		//for ( ; intNum < 10 ; ) {
		//	System.out.println(intNum++);
		//}
		
		System.out.println(intNum++);
		System.out.println(intNum++);
		
		int intSum = 0;
		intNum = 1;
		
		System.out.println("======================");
		System.out.printf("intNum : %d, intSum : %d\n", intNum, intSum);
		// intSum = intSum + intNum;
		intSum += intNum;
		System.out.printf("intNum : %d, intSum : %d\n", ++intNum, intSum);
		// intSum = intSum + intNum;
		intSum += intNum;
		System.out.printf("intNum : %d, intSum : %d\n", ++intNum, intSum);
	}
}
