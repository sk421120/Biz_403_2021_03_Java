package com.callor.apps.service;

import java.util.Scanner;

public class ScoreServiceV1A {

	// 클래스 영역에 Scanner 클래스를 사용하여 scan 객체 선언
	// NullPointerException
	// JDK 또는 여러가지 클래스를 가져와 사용하는 경우, 매우 자주 만나는 Exception
	// 클래스를 사용하여 객체를 "선언만" 아직 사용할 준비가 되어 있지 않다
	// = 생성, 초기화 가 안되었다
	Scanner scan;

	// 학생 수 만큼 과목점수를 저장할 배열 선언
	int[] intKor;
	int[] intEng;
	int[] intMath;

	// Service 클래스에서 배열의 개수를 고정하지 말고 최초로 객체를 생성할 때
	// 필요한 개수를 매개변수로 전달하고 전달받은 매개변수(members)의 값을 사용
	public ScoreServiceV1A(int members) {
		// scan 객체를 생성(초기화)하기
		// 객체를 선언하고 생성하는 코드가 없으면 사용하는 과정에서 NullPointException 발생
		scan = new Scanner(System.in);

		intKor = new int[members];
		intEng = new int[members];
		intMath = new int[members];
	}

	public void makeScores() {
		// 무한 반복문을 사용하여 점수가 0~100 범위를 벗어나면
		// 메세지를 보여주고 다시 점수 입력받도록 한다
		// 만약 정상적인 범위(0~100)를 입력하면 반복문을 종료하고, 다음 코드 실행
		while (true) {
			System.out.println("국어점수를 입력하세요");
			System.out.print(" >> ");
			int score = scan.nextInt();
			if(score < 0 || score > 100) {
				System.out.println("점수는 0 ~ 100까지 입니다.");
			} else {
				break;
			}
		}
	}
	
	// public : 전체, 공용, 모두, 누구나 객체.addNum() 형식으로 method 호출 명령 실행 Keyword
	// private
	// 개인적인, 현재 클래스에서만 method 호출 명령 실행 Keyword
	// 객체.inputScore() 형식으로 사용 불가
	// 외부에 공개하지 않고, 현재클래스의 코드에서만 호출할 수 있도록 제한하는 Keyword
	
	// Integer : void keyword 대신 정수를 선언하는 키워드를 사용하여 method 선언
	// method 코드 끝에 반드시 return 명령문이 있어야 한다
	
	/* 
	 * 여기에서 사용된 integer 키워드는 변수를 선언하는 용도의 키워드가 아니고
	 * return type 키워드라고 한다
	 * method 코드내에 " return 값;" 형식의 코드가 반드시 있어야 함을 선언
	 */
	private Integer inputScore() {
		int num = 0;
	
		// 현재 method코드의 void는 생략가능
		return num;
	}
	
	public String names() {
		return "홍길동";
	}
	
	public int add() {
		return 0;
	}
	
	public float addFloat() {
		return 0;
	}
	
	public long addLong() {
		return 0;
	}
	
	public boolean yesNo() {
		return false;
	}
	
	public boolean noYes() {
		return true;
	}
}
