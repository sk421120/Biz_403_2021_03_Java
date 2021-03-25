package com.callor.apps.service;

import java.util.Random;

public class ScoreServiceV1 {
	
	public static String dLine = "==============================================";
	public static String sLine = "----------------------------------------------";
	
	// 배열 선언
	int[] intKor;
	int[] intEng;
	int[] intMath;
	
	int[] intMemSum;
	float[] floatMemAvg;
	
	int intKorSum;
	int intEngSum;
	int intMathSum;
	
	int intSumTotal;
	float floatAvgTotal;
	
	// 생성자로 국어, 영어, 수학 배열 생성
	public ScoreServiceV1() {
		intKor = new int[10];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];
		
		intMemSum = new int[intKor.length];
		floatMemAvg = new float[intKor.length];
	}
	
	// 배열 10에 난수(50~100) 저장
	public void makeScore() {
		Random rnd = new Random();
		for(int i = 0 ; i < intKor.length ; i++) {
			intKor[i] = rnd.nextInt(51) + 50;
			intEng[i] = rnd.nextInt(51) + 50;
			intMath[i] = rnd.nextInt(51) + 50;
		}
	}
	
	// 총점 구하기
	public void makeSum() {
		for(int i = 0 ; i < intKor.length ; i++) {
			intMemSum[i] = intKor[i];
			intMemSum[i] += intEng[i];
			intMemSum[i] += intMath[i];
		}
	}
	
	// 평균 구하기
	public void makeAvg() {
		for(int i = 0 ; i < intKor.length ; i++) {
			floatMemAvg[i] = (float)intMemSum[i] / 3;
		}
	}
	
	// 점수, 총점, 평균 출력
	public void printScore() {
		System.out.println(dLine);
		System.out.println("\t자바 고등학교 시험 결과");
		System.out.println(sLine);
		System.out.println(" 학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(sLine);
		for(int arr = 0 ; arr < intKor.length ; arr++) {
			System.out.printf("%3d\t", arr+1);
			System.out.printf("%3d\t", intKor[arr]);
			System.out.printf("%3d\t", intEng[arr]);
			System.out.printf("%3d\t", intMath[arr]);
			System.out.printf("%3d\t", intMemSum[arr]);
			System.out.printf("%3.2f\n", floatMemAvg[arr]);
		}
	}
	
	// 과목별 합계 구하기
	public void makeScoreSum() {
		intKorSum = 0;
		intEngSum = 0;
		intMathSum = 0;
		for(int i = 0 ; i < intKor.length ; i++) {
			intKorSum += intKor[i];
			intEngSum += intEng[i];
			intMathSum += intMath[i];
		}
	}
	
	// 총점의 총점과 평균 구하기
	public void makeTotal() {
		intSumTotal = 0;
		floatAvgTotal = 0;
		for(int i = 0 ; i < intKor.length ; i++) {
			intSumTotal += intMemSum[i];
		}
		floatAvgTotal = (float)intSumTotal / intKor.length;
	}
	
	// 과목별 합계와 총점, 평균 출력
	public void printTotal() {
		System.out.printf(" 합계\t%d\t%d\t%d\t%d\t%3.2f\n",
				intKorSum, intEngSum, intMathSum, intSumTotal, floatAvgTotal);
	}
	
}
