package com.callor.apps;

import java.util.Random;

/*
 * 5명 학생의 3과목 점수(국어, 영어, 수학)의 성적표를 만들기 
 */
public class App_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

		// 배열은 0으로 초기화 된다
		// 과목 3가지를 학생수 만큼 배열 선언
		int[] intKor = new int[5];
		int[] intEng = new int[5];
		int[] intMath = new int[5];

		// 가상의 점수를 생성하기
		for (int i = 0; i < 5; i++) {
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;
		}

		//총점과 평균을 계산하여 저장해 두기
		int[] intSum = new int[5];
		float[] floatAvg = new float[5];

		for (int i = 0; i < 5; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];

			floatAvg[i] = (float) intSum[i] / 3;
		}
		
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		
		int intAllTotal = 0;
		
		for (int i = 0; i < 5 ; i++) {
			intKorSum += intKor[i];
			intEngSum += intEng[i];
			intMathSum += intMath[i];
			intAllTotal += intSum[i];
		}

		// 리스트 출력하기
		System.out.println("=================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%2d\t%3d\t%3d\t%3d\t%d\t%3.2f\n", i + 1, intKor[i], intEng[i], intMath[i], intSum[i], floatAvg[i]);
		}
		
		
		System.out.println("=================================================");
		System.out.printf("총점\t%d\t%d\t%d\t%4d", intKorSum, intEngSum, intMathSum, intAllTotal);
	}
}
