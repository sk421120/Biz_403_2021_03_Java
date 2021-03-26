package com.callor.apps.service;

public class TimeServiceV2 {

	// 변수 선언
	int[] intNums;

	// 정수형 배열 8 생성
	public TimeServiceV2() {
		intNums = new int[8];
	}

	public void makeTimes() {
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = i + 2;
		}
	}

	// 2 ~ 9까지 구구단 출력
	public void printTimes() {
		for (int i = 0; i < intNums.length; i++) {
			System.out.println( LinesService.dLines(12) );
			System.out.printf(" %d단 구구단\n", intNums[i]);
			System.out.println( LinesService.sLines(12) );
			for (int j = 2; j < 9; j++) {
				System.out.printf(" %d x %d = %2d\n", intNums[i], j, intNums[i] * j);
			}
		}
		System.out.println( LinesService.dLines(12) );
	}

	// 구구단 1개 출력
	public void printNumDan(int intNum) {
		System.out.println( LinesService.dLines(12) );
		System.out.printf(" %d단 구구단\n", intNum);
		System.out.println( LinesService.sLines(12) );
		for (int i = 0; i < intNums.length; i++) {
			System.out.printf(" %d x %d = %2d\n", intNum, intNums[i], intNum * intNums[i]);
		}
		System.out.println( LinesService.dLines(12) );
	}
	
	// 거꾸로 구구단 출력
	public void printReverseDan(int intNum) {
		System.out.println( LinesService.dLines(12) );
		System.out.printf(" %d단 거꾸로 구구단\n", intNum);
		System.out.println( LinesService.sLines(12) );
		for (int i = 0; i < intNums.length; i++) {
			int intRNum = intNums[(intNums.length-1) - i];
			System.out.printf(" %d x %d = %2d\n", intNum, intRNum, intNum * intRNum);
		}
		System.out.println( LinesService.dLines(12) );
	}

}
