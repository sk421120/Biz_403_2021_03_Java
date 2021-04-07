package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

public class ScoreServiceV6 {

	protected List<ScoreVO> scoreList;
	protected String[] subject;
	protected InputServiceV2 inService;
	
	public ScoreServiceV6() {
		scoreList = new ArrayList<ScoreVO>();
		subject = new String[] { "국어", "영어", "수학" };
		inService = new InputServiceV2();
	}
	
	public Integer inputScore() {
		System.out.println("=".repeat(50));
		for(int i = 0 ; i < subject.length ; i++) {
			System.out.print(subject[i] + " ");	
		}
		System.out.println("성적을 입력합니다.");
		System.out.println("=".repeat(50));
		
		ScoreVO vo = new ScoreVO();
		vo = inputScore(vo);
		if(vo == null) {
			return null;
		}
		scoreList.add(vo);
		
//		printScore();
		return 0;
	}
	
	public ScoreVO inputScore(ScoreVO vo) {
		Integer[] score = new Integer[subject.length];
		for(int i = 0 ; i < subject.length ; i++) {
			score[i] = inService.inputValue(subject[i], 0, 100);
			System.out.println("-".repeat(50));
			if(score[i] == null) {
				return null;
			}
		}
		vo.setKor(score[0]);
		vo.setEng(score[1]);
		vo.setMath(score[2]);
		
		return vo;
	}
	
	public void printScore() {
		System.out.println("=".repeat(50));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(50));
		for(int i = 0 ; i < scoreList.size() ; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.printf("%2d\t", i+1);
			System.out.printf("%2d\t", vo.getKor());
			System.out.printf("%2d\t", vo.getEng());
			System.out.printf("%2d\t", vo.getMath());
			System.out.printf("%d\t", vo.getTotal());
			System.out.printf("%3.1f\n", vo.getAvg());
		}
		System.out.println("=".repeat(50));
	}
}
