package com.callor.controller;

import java.util.Random;

public class Controller_14 {

	public static void main(String[] arg) {
		
		Random rnd = new Random();
		
		int intKor = 0;
		intKor = rnd.nextInt(100) + 1;
		int intEng = 0;
		intEng = rnd.nextInt(100) + 1;
		int intMath = 0;
		intMath = rnd.nextInt(100) + 1;
		
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		
		float floatAvg = (float)intSum / 3;
		
		System.out.println("===========================");
		System.out.printf("국어 : %d점\n", intKor);
		System.out.printf("영어 : %d점\n", intEng);
		System.out.printf("수학 : %d점\n", intMath);
		System.out.println("---------------------------");
		System.out.printf("총점 : %3d,  평균 : %3.2f\n", intSum, floatAvg);
		System.out.println("===========================");
	}
}
