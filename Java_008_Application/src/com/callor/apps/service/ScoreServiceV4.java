package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV4 {

	String[] subject;
	int[] intKor;
	int[] intEng;
	int[] intMath;

	Scanner scan;

	public ScoreServiceV4(int members) {
		scan = new Scanner(System.in);
		subject = new String[] { "국어", "영어", "수학" };
		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}

	public void makeScores() {
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d번 학생의 성적입력\n", i+1);
			intKor[i] = this.inputScore(subject[0]);
			intEng[i] = this.inputScore(subject[1]);
			intMath[i] = this.inputScore(subject[2]);
		}
	}

	private Integer inputScore(String sub) {
		Integer score = 0;
		while (true) {
			System.out.println(sub + "의 점수를 입력하세요");
			System.out.printf(" >> ");
			score = scan.nextInt();
			if (score < 0 || score > 100) {
				System.out.println(sub + "점수는 0~100까지만 입력해주세요");
				continue;
			} // continue 명령 대신 else { break; }
			break;
		}
		return score;
	}

}
