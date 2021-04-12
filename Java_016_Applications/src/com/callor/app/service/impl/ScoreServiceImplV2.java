package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.service.ScoreService;
import com.callor.app.service.model.ScoreVO;
import com.sk421120.standard.InputService;
import com.sk421120.standard.MenuService;
import com.sk421120.standard.impl.InputServiceImplV1;
import com.sk421120.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV2 implements ScoreService{

	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	protected MenuService menuSerive;
	protected InputService inService;
	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	protected String[] subject;
	protected int line;
	
	public ScoreServiceImplV2() {
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceImplV1();
		scan = new Scanner(System.in);
		subject = new String[] { "국어", "영어", "수학" };
		line = 50;
	}
	
	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub
		
		/*
		 * 보통 멤버변수(클래스영역에 선언된 변수들) 객체는 이 클래스의 생성자에서 만드는 것이 좋다
		 * 하지만 객체를 생성할 때 전달해야 할 매개변수(파라메터)에 대하여 수행해야 할
		 * 연산코드가 있을 경우는 객체를 사용하기 전에 객체를 생성하는 코드를 작성하여도 된다.
		 */
		List<String> scoreMenu = new ArrayList<String>();
		scoreMenu.add("성적입력");
		scoreMenu.add("성적 리스트 출력");
		scoreMenu.add("성적 저장");
		
		menuSerive = new MenuServiceImplV1("빛고을 고교 성적처리",scoreMenu);
		while(true) {
			Integer menu = menuSerive.selectMenu();
			if(menu == null) {
				System.out.println("업무 종료");
				break;
			}
			
			if(menu == 1) {
				this.inputScore();
			} else if(menu == 2) {
				this.printScore();
			} else if(menu == 3) {
				this.saveScore();
			}
		}
		
		
	}

	@Override
	public void inputScore() {
		// TODO 학번, 이름, 과목별 성적 입력 받아 ScoreVO 객체에 담고, list 에 추가
		// 	* ScoreVO 클래스를 사용하여 생성한 scoreVO 객체에 담고 = ScoreVO에 담고
		System.out.println("=".repeat(line));
		Integer intNum = inService.inputValue("학번", 0);
		if(intNum == null) {
			return;
		}
		String strNum = this.inputScore(intNum);
		System.out.println("-".repeat(line));
		System.out.println("이름을 입력해주세요. (종료 : QUIT)");
		String strName = scan.nextLine();
		if(strName.equals("QUIT")) {
			return;
		}
		System.out.println("=".repeat(line));
		System.out.printf("학번 [%s] 이름 [%s] 학생의 성적 정보를 입력합니다.\n", strNum, strName);
		System.out.println("-".repeat(line));
		Integer[] score = new Integer[subject.length];
		for(int i = 0; i < score.length ; i++) {
			score[i] = inService.inputValue(subject[i], 0, 100);
			if(score[i] == null) {
				return;
			}
		}
		
		ScoreVO vo = new ScoreVO();
		vo.setNum(strNum);
		vo.setName(strName);
		vo.setKor(score[국어]);
		vo.setEng(score[영어]);
		vo.setMath(score[수학]);		
		scoreList.add(vo);
		
	}
	
	protected String inputScore(Integer num) {
		String strNum = Integer.toString(num);
		return strNum;
	}
	
	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveScore() {
		System.out.println("성적리스트 저장");
		System.out.println("저장할 파일 이름을 입력하세요.");
		System.out.print(" >> ");
		String strFileName = scan.nextLine();
		
		if(strFileName.equals("")) {
			System.out.println("파일 이름을 입력해야합니다.");
			return;
		}
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
