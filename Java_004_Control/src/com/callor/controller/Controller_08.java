package com.callor.controller;

import java.util.Random;

public class Controller_08 {

	public static void main(String[] arg) {
		
		Random rnd = new Random();
		
		// 어떤 명령을 5번 반복하여 수행하겠다
		for(int i = 0 ; i < 10 ; i++) {
			
			// 정수형 난수(임의의 정수)를 만들어서 num변수에 저장하고
			int num = rnd.nextInt();
			// 그 값을 출력하라
			System.out.print(num + "\t");
		}
		System.out.println();
		System.out.println("================================");
		
		for(int i = 0 ; i < 5 ; i++) {
			// 0 ~ 99 (= 100-1, < 99)까지의 정수를 만들어라
			int num = rnd.nextInt(100);
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("================================");
		
		for(int i = 0 ; i < 5 ; i++) {
			int num = rnd.nextInt(10);
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("================================");
	}
}
