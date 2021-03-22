package com.callor.controller;

public class Controller_01 {

	public static void main(String[] arg) {
		
		//3의 배수의 합, 4의 배수의 합
		//합을 구하기위해
		//변수를 선언한다
		int intSum = 0;		// 3의 배수합
		int intSum1 = 0;	// 4의 배수합
		int intSum2 = 0;	// 3과 5의 배수 합
		
		//1. 0 ~ 99 + 1 => 1~100
		for(int i = 0 ; i < 20 ; i++) {
			
			//1-1. 1~100
			int num = i + 1;
			
			//2. 3의 배수이면 num값을 intSum 변수에 누적하라
			if( num % 3 == 0 ) { 
				intSum += num;	
				
				// num % 3 == AND num % 5 == 0
				if( num % 5 == 0) {
					intSum2 += num;
				}
			}
			//3. 4의 배수이면 num값을 intSum1 변수에 누적하라
			if ( num % 4 == 0 ) {
				intSum1 += num;
			}
			
		}
		
		/*
		 * 
		 */
		System.out.println("========================");
		System.out.printf("3의 배수의 합\t: %4d\n", intSum);
		System.out.printf("4의 배수의 합\t: %4d\n", intSum1);
		System.out.printf("3과 5의 배수의 합\t: %4d\n", intSum2);
		System.out.println("========================");
	}
}
