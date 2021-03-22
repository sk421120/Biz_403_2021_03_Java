package com.callor.controller;

import java.util.Random;

/*
 *  0 ~ 100까지 중의 임의의 정수 5개를 만들어서 그 수가 짝수인지 아닌지 출력
 */
public class Controller_10 {

	public static void main(String[] arg) {
		
		Random rnd = new Random();
		
		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);
		int num3 = rnd.nextInt(100);
		int num4 = rnd.nextInt(100);
		int num5 = rnd.nextInt(100);
		
		
		if(num1 % 2 == 0) {
			System.out.println(num1 + " 짝수");
		} else {
			System.out.println(num1 + " 짝수 아님");
		}
		
		if(num2 % 2 == 0) {
			System.out.println(num2 + " 짝수");
		} else {
			System.out.println(num2 + " 짝수 아님");
		}
		
		if(num3 % 2 == 0) {
			System.out.println(num3 + " 짝수");
		} else {
			System.out.println(num3 + " 짝수 아님");
		}
		
		if(num4 % 2 == 0) {
			System.out.println(num4 + " 짝수");
		} else {
			System.out.println(num4 + " 짝수 아님");
		}
		
		if(num5 % 2 == 0) {
			System.out.println(num5 + " 짝수");
		} else {
			System.out.println(num5 + " 짝수 아님");
		}
		
		System.out.println("=======================");
		// 반복문을 사용하여 임의의 정수 100개를 만들고 그 수가 짝수인지 아닌지 판별하는 코드
		for(int i = 0 ; i < 100 ; i++) {
			int num = rnd.nextInt(100);
			if(num % 2 == 0) {
				System.out.println(num +" 짝수");
			} else {
				System.out.println(num +" 짝수 아님");
			}
		}
	}
}
