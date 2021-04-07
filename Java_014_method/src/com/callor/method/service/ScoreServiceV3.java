package com.callor.method.service;

public class ScoreServiceV3 {

	protected InputServiceV2 inService;
	
	public ScoreServiceV3() {
		inService = new InputServiceV2();
	}
	
	public void inputScore() {
		System.out.println("=".repeat(50));
		System.out.println("국어, 영어, 수학 점수를 입력해주세요.");
		System.out.println("=".repeat(50));
		Integer intKor = inService.inputValue("국어", 0, 100);
		if(intKor == null) {
			return;
		}
		System.out.println("-".repeat(50));
		Integer intEng = inService.inputValue("영어", 0, 100);
		if(intEng == null) {
			return;
		}
		System.out.println("-".repeat(50));
		Integer intMath = inService.inputValue("수학", 0, 100);
		if(intMath == null) {
			return;
		}
		System.out.println("-".repeat(50));
		
		printScore(intKor, intEng, intMath);
	}
	
	public void printScore(int kor, int eng, int math) {
		int sum = this.makeSum(kor,eng,math);
		float avg = this.makeAvg(sum);
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %3.2f\n", avg);
	}
	
	public Integer makeSum(int kor, int eng, int math) {
		return kor + eng + math;
	}
	
	public float makeAvg(int sum) {
		return (float) sum / 3;
	}
	
}
