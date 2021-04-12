package com.callor.app.service.impl;

import java.util.Scanner;

import com.callor.app.service.ScoreService;

public class ScoreServiceV2 implements ScoreService {

	protected Scanner scan;
	
	public ScoreServiceV2() {
		scan = new Scanner(System.in);
	}
	
	@Override
	public void selectMenu() {
		while (true) {
			// TODO 메뉴 출력
			System.out.println("=".repeat(50));
			System.out.println("빛고을 고교 성적처리 2021");
			System.out.println("=".repeat(50));
			System.out.println("1.성적입력");
			System.out.println("2.성적리스트 출력");
			System.out.println("3.성적 저장");
			System.out.println("QUIT.종료");
			System.out.println("-".repeat(50));
			System.out.print(" >> ");
			String strM = scan.nextLine();
			if (strM.equals("QUIT")) {
				break;
			}
			Integer intM = selectMenu(strM);
			
			if(intM == 1 ) {
				// 성적입력
				this.inputScore();
			} else if( intM == 2) {
				// 성적리스트 출력
				this.printScore();
			} else if( intM == 3) {
				// 성적 저장
				this.saveScore();
			} else {
				System.out.println("\t* 잘못된 메뉴입니다.");
			}

		}
		
		System.out.println("업무를 종료합니다.");
		
	}
	
	private Integer selectMenu(String menu) {
		// TODO 메뉴 오류검사
		Integer intM;
		try {
			intM = Integer.valueOf(menu);
		} catch (NumberFormatException e) {
			return null;
		}
		
		return intM;
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer checkScore() {
		// TODO Auto-generated method stub
		return null;
	}

}
