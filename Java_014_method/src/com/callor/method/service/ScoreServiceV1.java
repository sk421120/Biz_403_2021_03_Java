package com.callor.method.service;

public class ScoreServiceV1 {

	protected InputServiceV1 isV1;

	public ScoreServiceV1() {
		isV1 = new InputServiceV1();
	}

	public void inputScore() {
		Integer retNum = isV1.inputValue("국어", 0, 100);
		if (retNum == null) {
			System.out.println("종료");
		} else {
			System.out.println("국어 점수 : " + retNum);
		}
	}
}
