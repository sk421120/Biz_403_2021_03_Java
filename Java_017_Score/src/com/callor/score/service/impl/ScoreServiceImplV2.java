package com.callor.score.service.impl;

import java.util.Scanner;

import com.callor.score.service.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	protected Scanner scan;

	public ScoreServiceImplV2() {
		scan = new Scanner(System.in);
	}

	@Override
	public void inputScore() {
		Integer intNum = inService.inputValue("학번", 0);
		if (intNum == null) {
			return;
		}
		String strNum = this.inputScore(intNum);

		String name = this.inputScore(strNum);
		if(name == null) {
			return;
		}

		Integer[] score = new Integer[subject.length];

		ScoreVO vo = new ScoreVO();
	}

	protected String inputScore(Integer intNum) {
		return String.format("%06d", intNum);
	}

	protected String inputScore(String strNum) {
		String name = null;

		System.out.printf("%s의 이름을 입력해주세요. (중단 : QUIT)\n", strNum);
		System.out.print(" >> ");
		name = scan.nextLine();
		if (name.equals("QUIT")) {
			return null;
		}

		return name;
	}
}
