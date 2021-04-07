package com.callor.method.service;

public class ScoreServiceV4 {

	protected String[] subject;
	protected InputServiceV2 inService;
	
	public ScoreServiceV4() {
		subject = new String[] { "국어", "영어", "수학" };
		inService = new InputServiceV2();
	}
	
	public void inputScore() {
		Integer[] score = new Integer[subject.length];
		System.out.println("=".repeat(50));
		for(int i = 0 ; i < subject.length ; i++) {
			System.out.printf("%s ",subject[i]);
		}
		System.out.println("성적을 입력합니다.");
		System.out.println("=".repeat(50));
		
		for(int i = 0 ; i < score.length ; i++) {
			score[i] = inService.inputValue(subject[i],0,100);
			if(score[i] == null) {
				return;
			}
			System.out.println("-".repeat(50));
		}
		printScore(score);	
	}
	
	public void printScore(Integer[] score) {
		int sum = makeSum(score);
		float avg = makeAvg(sum);
		
		for(int i = 0 ; i < subject.length ; i++) {
			System.out.printf("%s : %d\n", subject[i], score[i]);	
		}
		
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %3.1f\n", avg);
	}
	
	public int makeSum(Integer[] score) {
		int sum = 0;
		for(int i = 0 ; i < score.length ; i++) {
			sum += score[i];
		}
		return sum;
	}
	
	public float makeAvg(int sum) {
		return (float) sum / subject.length;
	}
}
