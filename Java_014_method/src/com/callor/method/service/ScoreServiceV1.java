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
	
	public void scoreService() {
		System.out.println("=".repeat(50));
		System.out.println("추가할 성적의 과목을 입력해주세요.");
		System.out.println("-".repeat(50));
		System.out.print(" >> ");
		String strSub = isV1.inputValue();
		// null 조건은 생략
		String title = String.format("%s의 성적범위 시작", strSub);
		Integer start = isV1.inputValue(title);
		title = String.format("%s의 성적범위 끝", strSub);
		Integer end = isV1.inputValue(title);
		isV1.inputValue(strSub,start,end);
		
	}
}
