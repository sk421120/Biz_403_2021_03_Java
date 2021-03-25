package com.callor.apps;

import java.util.Random;

public class App_01 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intNums = new int[20];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
		}

		// intNums 소수 판별
		for (int i = 0; i < intNums.length; i++) {

			boolean notPrime = false;	// flag 변수
			// int count = 0;
			// int sw = 1;
			
			// 소수 검사
			for (int j = 2; j < intNums[i]; j++) {
				
				// 비교 연산문에서 결과 한번이라도 true가 되면
				if (intNums[i] % j == 0) {
					// System.out.println(intNums[i] + " 는 " + j + "소수 아님");
					// sw *= -1;
					// count++;
					notPrime = true;	// flag 변수의 setting
					break;
				}
				// else num1의 값이 소수가 아니더라도 계속해서 소수라는 메세지 출력된다.
			}

			// for() 반복문이 모두 완료되었거나 중간에 break만나서 중단되었거나
			// if(count == 0) {
			// if (sw > 0) {
			
			// setting되거나 그렇지 않은 경우를 판단하여 결과를 출력하기
			if (notPrime) {
				//System.out.println(intNums[i] + " 는 소수 아님");
			} else {
				System.out.println(intNums[i] + " 는 소수!!!!!!");

			}
		}
		
		int num = 0;
		int num2 = 11;
		
		for(num = 2 ; num < num2 ; num++) {
			if(num2 % num == 0) {
				break;
			}
		}
		
		/*
		 * for() 반복문에서 사용할 num(index변수)를 반복문 시작전에 선언을 하고 실행을 하면
		 * 	종료된 후에 num값을 읽을 수 있다.
		 * 
		 * 이때
		 * 1. 만약 중간에 break를 만나서 for() 중단되거나
		 * 2. break 없이 for() 반복문이 모두 완료되거나
		 * 	할텐데 1과 2의 경우에 num 변수의 상태가 다르다
		 * 
		 * 보통은 num 변수의 값은 조건문에 최대값과 같다
		 * 1번의 경우 num 값은 num2보다 항상 작다
		 * 2번의 경우 num 값은 num2보다 크거나 같다
		 * 	if(num == num2) 라는 비교문을 사용하는 것보다는
		 * 	if(num < num2) 조건문을 사용하는 것이 논리적인 문제를 최소화 할 수 있다.
		 */
		
		// 조건문에서 값이 애매하게 만들어져 논리적 오류 발생 가능성
		if(num == num2) {
			System.out.println(num2 + " 소수이다");
		} else {
			System.out.println(num2 + " 소수 아님");
		}
		
		// 논리적인 오류 최소화하기 위해 비교연산자를 1개만 사용하여 검사할 수 있는 코드를 사용하는 것이 좋다
		if(num < num2) {
			System.out.println(num2 + " 소수 아님");
		} else {
			System.out.println(num2 + " 소수이다");
		}
		System.out.printf("num2 : %d, num : %d\n", num2, num);
		

	}
}
