package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

public class ScoreServiceV5 {

	protected int members;
	protected List<Integer> kors;
	protected List<Integer> engs;
	protected List<Integer> maths;

	protected String[] subject;

	protected InputServiceV2 inService;

	public ScoreServiceV5() {
		members = 5;
		kors = new ArrayList<Integer>();
		engs = new ArrayList<Integer>();
		maths = new ArrayList<Integer>();

		subject = new String[] { "국어", "영어", "수학" };

		inService = new InputServiceV2();
	}

	public void inputScore() {
		System.out.println("=".repeat(50));
		System.out.printf("%d명의 ", members);
		for (int i = 0; i < subject.length; i++) {
			System.out.printf("%s ", subject[i]);
		}
		System.out.println("성적을 입력합니다.");
		System.out.println("=".repeat(50));

		for (int i = 0; i < members; i++) {
			System.out.printf("\t%d번 학생의 성적\n", i + 1);
			System.out.println("-".repeat(50));
			Integer num = this.listScore();
			if (num == null) {
				return;
			}
			System.out.println("=".repeat(50));
		}
		printScore();
	}

	public Integer listScore() {
		Integer[] score = new Integer[subject.length];
		for (int i = 0; i < subject.length; i++) {
			score[i] = inService.inputValue(subject[i], 0, 100);
			if (score[i] == null) {
				return null;
			}
			// scores에는 한 학생의 국어, 영어, 수학 점수가 저장되어 있다
		}
		kors.add(score[0]);
		engs.add(score[1]);
		maths.add(score[2]);
		return 0;

	}

	public void printScore() {
		int sum[] = makeSum();
		float avg[] = makeAvg(sum);

		System.out.println("=".repeat(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for (int i = 0; i < members; i++) {
			System.out.printf("%d\t",i+1);
			System.out.printf("%3d\t", kors.get(i));
			System.out.printf("%3d\t", engs.get(i));
			System.out.printf("%3d\t", maths.get(i));
			System.out.printf("%4d\t", sum[i]);
			System.out.printf("%3.1f\n", avg[i]);
		}
		System.out.println("=".repeat(50));
	}
	
	public void printScore1() {
		int sum[] = makeSum();
		float avg[] = makeAvg(sum);

		for (int i = 0; i < members; i++) {
			System.out.println("=".repeat(50));
			System.out.printf("%d번 학생의 성적\n", i + 1);
			System.out.println("-".repeat(50));
			System.out.printf("%s : %d\n", subject[0], kors.get(i));
			System.out.printf("%s : %d\n", subject[1], engs.get(i));
			System.out.printf("%s : %d\n", subject[2], maths.get(i));
			System.out.println("-".repeat(50));
			System.out.printf("총점 : %d\n", sum[i]);
			System.out.printf("평균 : %3.1f\n", avg[i]);
		}
		System.out.println("=".repeat(50));
	}
	

	public int[] makeSum() {
		int sum[] = new int[members];
		for (int i = 0; i < members; i++) {
			sum[i] = kors.get(i);
			sum[i] += engs.get(i);
			sum[i] += maths.get(i);
		}
		return sum;
	}

	public float[] makeAvg(int sum[]) {
		float avg[] = new float[members];
		for (int i = 0; i < members; i++) {
			avg[i] = (float) sum[i] / subject.length;
		}
		return avg;
	}

}
