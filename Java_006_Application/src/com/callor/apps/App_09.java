package com.callor.apps;

import java.util.Random;

public class App_09 {

	public static void main(String[] args) {
		String[] strNames = { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정", "장보고" };

		int[] intNum = new int[strNames.length];

		int[] intKor = new int[strNames.length];
		int[] intEng = new int[strNames.length];
		int[] intMath = new int[strNames.length];

		int[] intTotal = new int[strNames.length];
		float[] floatAvg = new float[strNames.length];

		Random rnd = new Random();
		for (int i = 0; i < strNames.length; i++) {
			intNum[i] = i + 1;
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;
		}

		for (int i = 0; i < strNames.length; i++) {
			intTotal[i] = intKor[i];
			intTotal[i] += intEng[i];
			intTotal[i] += intMath[i];
			floatAvg[i] = (float) intTotal[i] / 3;
		}
		System.out.println("빛나라 고교 성적처리");
		System.out.println("===========================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------------");
		for(int i = 0 ; i < strNames.length ; i++) {
			System.out.printf("%2d\t", intNum[i]);
			System.out.printf("%s\t", strNames[i]);
			
			System.out.printf("%3d\t", intKor[i]);
			System.out.printf("%3d\t", intEng[i]);
			System.out.printf("%3d\t", intMath[i]);
			
			System.out.printf("%3d\t", intTotal[i]);
			System.out.printf("%3.2f\n", floatAvg[i]);
		}
		System.out.println("===========================================================");
		// 과목별 총점, 총점의 총점, 평균의 평균
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		
		int intTotalSum = 0;
		
		float floatAvgSum = 0;
		
		for( int i = 0 ; i < strNames.length ; i++) {
			intKorSum += intKor[i];
			intEngSum += intEng[i];
			intMathSum += intMath[i];
			
			intTotalSum += intTotal[i];
		}
		floatAvgSum = (float) intTotalSum / strNames.length ;
		
		System.out.printf("\t 합계 \t%d\t%d\t%d\t%d\t%3.2f\n", intKorSum, intEngSum, intMathSum, intTotalSum, floatAvgSum);
		
	}
}
