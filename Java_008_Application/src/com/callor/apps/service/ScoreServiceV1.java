package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	// 선언
	int[] intKor;
	int[] intEng;
	int[] intMath;

	int[] intSum;
	float[] floatAvg;

	Scanner scan;

	int memNum;

	// 배열 변수 생성
	public ScoreServiceV1() {
		intKor = new int[5];
		intEng = new int[intKor.length];
		intMath = new int[intKor.length];

		intSum = new int[intKor.length];
		floatAvg = new float[intKor.length];

		memNum = 0;
	}

	// 순서대로 점수 입력받아 배열에 저장하기

	/*
	 * public void inputScore() { scan = new Scanner(System.in);
	 * 
	 * System.out.println(LinesService.dLines(50));
	 * System.out.println(" 자바 고등학교 성적 처리 프로그램입니다.");
	 * System.out.printf(" %d명의 학생의 성적을 입력하고 Enter를 눌러주세요.\n", intKor.length);
	 * 
	 * for (int i = 0; i < intKor.length; i++) {
	 * System.out.println(LinesService.sLines(50));
	 * System.out.printf("\t%d번 학생 성적\n", i + 1); System.out.printf(" 국어 >> ");
	 * intKor[i] = scan.nextInt(); if(intKor[i] < 0 || intKor[i] > 100) {
	 * System.out.println("0에서 100사이의 값을 입력해주세요."); } System.out.printf(" 영어 >> ");
	 * intEng[i] = scan.nextInt(); System.out.printf(" 수학 >> "); intMath[i] =
	 * scan.nextInt(); } scan.close(); }
	 */

	public void inputScore() {
		scan = new Scanner(System.in);
		int input = 0;

		System.out.println(LinesService.dLines(50));
		System.out.println(" 자바 고등학교 성적 처리 프로그램입니다.");
		System.out.printf(" %d명의 학생의 성적을 입력하고 Enter를 눌러주세요.\n", intKor.length);

		for (int i = 0; i < intKor.length; i++) {
			System.out.println(LinesService.sLines(50));
			System.out.printf("\t%d번 학생 성적\n", i + 1);
			while (true) {
				System.out.printf(" 국어 >> ");
				input = scan.nextInt();
				if (input < 0 || input > 100) {
					System.out.println("\t0에서 100사이의 값을 다시 입력해주세요.");
				} else {
					intKor[i] = input;
					break;
				}
			}
			while (true) {
				System.out.printf(" 영어 >> ");
				input = scan.nextInt();
				if (input < 0 || input > 100) {
					System.out.println("\t0에서 100사이의 값을 다시 입력해주세요.");
				} else {
					intEng[i] = input;
					break;
				}
			}
			while (true) {
				System.out.printf(" 수학 >> ");
				input = scan.nextInt();
				if (input < 0 || input > 100) {
					System.out.println("\t0에서 100사이의 값을 다시 입력해주세요.");
				} else {
					intMath[i] = input;
					break;
				}
			}
		}
		scan.close();
	}

	// 학생별 (배열에 저장된) 점수 총점 구하기
	public void makeSum() {
		for (int i = 0; i < intKor.length; i++) {
			intSum[i] = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}
	}

	// 학생별 (배열에 저장된) 점수 평균 구하기
	public void makeAvg() {
		for (int i = 0; i < intKor.length; i++) {
			floatAvg[i] = (float) intSum[i] / 3;
		}
	}

	// 학생별 점수, 총점, 평균 출력하기
	public void printScore() {
		System.out.println(LinesService.dLines(50));
		System.out.println(" 학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(LinesService.sLines(50));
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf(" %2d\t%3d\t%3d\t%3d\t%d\t%3.2f\n", i + 1, intKor[i], intEng[i], intMath[i], intSum[i],
					floatAvg[i]);
		}
		System.out.println(LinesService.dLines(50));
	}

	public void findMember() {
		scan = new Scanner(System.in);
		int num = 0;

		System.out.println(LinesService.sLines(50));
		System.out.println("\t조회하고 싶은 학생의 학번을 입력해주세요.");
		System.out.print(" >> ");
		num = scan.nextInt(); // error
		if (num > 5 || num < 1) {
			System.out.println(" 없는 번호 입니다!");
		} else {
			memNum = num;
		}
		scan.close();
	}

	public void findScore() {
		System.out.println(LinesService.dLines(50));
		System.out.println("\t%d번 학생 점수 조회 결과입니다");
		System.out.println(LinesService.sLines(50));
		System.out.println(" 학번\t국어\t영어\t수학\t총점\t평균");
		for (int i = 0; i < intKor.length; i++) {
			if (i + 1 == memNum) {
				System.out.printf(" %2d\t%3d\t%3d\t%3d\t%d\t%3.2f\n", i + 1, intKor[i], intEng[i], intMath[i],
						intSum[i], floatAvg[i]);
			}
		}
		System.out.println(LinesService.dLines(50));
	}
}