package com.callor.apps.service;

public class TimeServiceV1 {

	// 변수 선언
	String dLine = LinesService.dLines(12);
	String sLine = LinesService.sLines(dLine.length());
	int[] intNums;

	// 정수형 배열 8 생성
	public TimeServiceV1() {
		intNums = new int[8];
	}

	/*
	 * 배열은 총 8개
	 * 배열에 저장할 값은 2 ~ ??
	 */
	// 정수형 배열 8 2 ~ 9까지 값 저장
	public void makeTimes() {
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = i + 2;
		}
	}

	// 2 ~ 9까지 구구단 출력
	public void printTimes() {
		for (int i = 0; i < intNums.length; i++) {
			
			// method에 return ?? 명령문이 있으면 변수 = method() 형식으로 코드를 작성하고
			// method가 return 해준 결과값을 변수에 저장할 수 있다
			System.out.println(dLine);
			System.out.printf(" %d단 구구단\n", intNums[i]);
			System.out.println(sLine);
			
			for (int j = 2; j < 9; j++) {
				System.out.printf(" %d x %d = %2d\n", intNums[i], j, intNums[i] * j);
			}
		}
		System.out.println(dLine);
	}

	// 구구단 1개 출력
	public void printNumDan(int intNum) {
		System.out.println(dLine);
		System.out.printf(" %d단 구구단\n", intNum);
		System.out.println(sLine);
		for (int i = 0; i < intNums.length; i++) {
			System.out.printf(" %d x %d = %2d\n", intNum, intNums[i], intNum * intNums[i]);
		}
		System.out.println(dLine);
	}
	
	// 거꾸로 구구단 출력
	public void printReverseDan(int intNum) {
		System.out.println(dLine);
		System.out.printf(" %d단 거꾸로 구구단\n", intNum);
		System.out.println(sLine);
		for (int i = 0; i < intNums.length; i++) {
			int intRNum = intNums[(intNums.length-1) - i];
			System.out.printf(" %d x %d = %2d\n", intNum, intRNum, intNum * intRNum);
		}
		System.out.println(dLine);
	}

}
