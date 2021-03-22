package com.callor.controller;

import java.util.Random;

public class Controller_15 {

	public static void main(String[] arg) {

		Random rnd = new Random();

		int intKor1 = rnd.nextInt(100) + 1;
		int intKor2 = rnd.nextInt(100) + 1;
		int intKor3 = rnd.nextInt(100) + 1;
		int intKor4 = rnd.nextInt(100) + 1;
		int intKor5 = rnd.nextInt(100) + 1;
		int intKor6 = rnd.nextInt(100) + 1;
		int intKor7 = rnd.nextInt(100) + 1;
		int intKor8 = rnd.nextInt(100) + 1;
		int intKor9 = rnd.nextInt(100) + 1;
		int intKor10 = rnd.nextInt(100) + 1;

		int intSum = 0;
		intSum = intKor1;
		intSum += intKor2;
		intSum += intKor3;
		intSum += intKor4;
		intSum += intKor5;
		intSum += intKor6;
		intSum += intKor7;
		intSum += intKor8;
		intSum += intKor9;
		intSum += intKor10;

		float floatAvg = (float) intSum / 10;

		System.out.println("==========================");
		// for(int i = 0 ; i < 10 ; i++ ) {
		// int intKor = rnd.nextInt(100) + 1;
		// System.out.printf("학생%2d : %3d점\n", i+1, intKor);
		// intSum += intKor;
		// }
		// floatAvg = (float)intSum / 10;
		
		for(int i = 0 ; i < 10 ; i++ ) {
			int num = i+1;
			
			/*
			 * num 변수하고 intKor 이름하고 합하여 intKor1~.. 처럼 만들수 있을것 같은데 안된다
			 * intKornum 이라고 작성하면 java는 intKornum이라는 변수 찾음
			 */
		}

		System.out.printf("학생 1  : %3d점\n", intKor1);
		System.out.printf("학생 2  : %3d점\n", intKor2);
		System.out.printf("학생 3  : %3d점\n", intKor3);
		System.out.printf("학생 4  : %3d점\n", intKor4);
		System.out.printf("학생 5  : %3d점\n", intKor5);
		System.out.printf("학생 6  : %3d점\n", intKor6);
		System.out.printf("학생 7  : %3d점\n", intKor7);
		System.out.printf("학생 8  : %3d점\n", intKor8);
		System.out.printf("학생 9  : %3d점\n", intKor9);
		System.out.printf("학생 10 : %3d점\n", intKor10);

		System.out.println("--------------------------");
		System.out.printf("총점 : %d,  평균 : %3.2f\n", intSum, floatAvg);
		System.out.println("==========================");
	}
}
