package com.callor.app.service;

import com.sk421120.standard.InputService;
import com.sk421120.standard.impl.InputServiceImplV1;

public class ScoreServiceV1 {
	
	protected InputService isV1;
	protected String[] subject;
	
	public ScoreServiceV1() {
		isV1 = new InputServiceImplV1();
		subject = new String[] { "국어", "영어", "수학" };
	}
	
	public void inputScore() {
		Integer[] score = new Integer[subject.length];
		System.out.println("=".repeat(50));
		for(String sub : subject) {
			System.out.print(sub + " ");
		}
		System.out.println("성적을 입력해주세요.");
		
		for(int i = 0 ; i < score.length ; i++) {
			score[i] = isV1.inputValue(subject[i], 0, 100);
			if(score[i] == null) {
				return;
			}
		}
		
		Integer total = this.makeTotal(score);
		float avg = this.makeAvg(total);
		
		this.printScore(score, total, avg);
	}
	
	public void printScore(Integer[] score, int total, float avg) {
		System.out.println("=".repeat(50));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for(int i = 0 ; i < score.length ; i++) {
			System.out.print(score[i] + "\t");
		}
		System.out.println(total + "\t");
		System.out.println(avg + "\t");
		System.out.println("=".repeat(50));
	}
	
	public Integer makeTotal(Integer[] score) {
		Integer sum = 0;
		for(int i = 0; i < score.length ; i++) {
			sum += score[i];
		}
		return sum;
	}
	
	public float makeAvg(Integer sum) {
		return (float) sum / subject.length;
	}

}
