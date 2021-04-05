package com.callor.method.service;

public class NumberServiceV7 {

	protected String[] strSub;
	InputService iService;

	public NumberServiceV7() {
		strSub = new String[] { "국어", "영어", "수학", "과학", "국사" };
		iService = new InputService();
	}

	public void inputScore() {
		Integer[] score = new Integer[strSub.length];
		for (int i = 0; i < strSub.length; i++) {
				Integer retNum = this.inputScore(strSub[i] + "( 0 ~ 100 )");

				if(retNum == null) {
					System.out.println("입력 종료");
					return;
				}
				
				score[i] = retNum;
//				Integer inputScore = iService.inputValue(strSub[i] + "( 0 ~ 100 )");
//				
//				if (inputScore == null) {
//					System.out.println("입력 종료");
//					return;
//				} else if( inputScore < 0 || inputScore > 100) {
//					System.out.println("범위는 0~100 입니다.");
//				} else {
//					score[i] = inputScore;
//					break;
//				}
//			}
		}

		this.printScore(score);
	}
	
	private Integer inputScore(String sub) {
		while (true) {
			Integer inputScore = iService.inputValue(sub);
			
			if (inputScore == null) {
//				System.out.println("입력 종료");
				return null;
			} else if( inputScore < 0 || inputScore > 100) {
				System.out.println("범위는 0~100 입니다.");
			} else {
				return inputScore;
			}
		}
	}

	public void printScore(Integer[] scoreList) {
		for (int i = 0; i < strSub.length; i++) {
			System.out.printf("%s 점수 : %d점\n", strSub[i], scoreList[i]);
		}
	}
}
