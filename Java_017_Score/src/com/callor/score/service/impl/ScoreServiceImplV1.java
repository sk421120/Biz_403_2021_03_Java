package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.service.ScoreService;
import com.callor.score.service.model.ScoreVO;
import com.sk421120.standard.InputService;
import com.sk421120.standard.MenuService;
import com.sk421120.standard.impl.InputServiceImplV1;
import com.sk421120.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService{

	protected List<ScoreVO> scoreList;
	protected InputService inService;
	protected String[] subject;
	protected int line = 50;
	
	// 생성자 코드는 최소화
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceImplV1();
		subject = new String[] { "국어", "영어", "수학"};
	}
	
	@Override
	public void selectMenu() {
		// TODO 메뉴서비스 이용한 메뉴출력
		List<String> menu = new ArrayList<String>();
		menu.add("학생정보 등록");
		menu.add("성적등록");
		menu.add("성적정보 열기");
		menu.add("성적정보 저장");
		menu.add("성적정보 출력");
		MenuService mService = new MenuServiceImplV1("대한 고등학교 성적처리 시스템 2021", menu);
		
		while (true) {
			
			Integer intM = mService.selectMenu();
			if(intM == null) {
				break;
			}
			
			if(intM == 1) {
				// 학생정보 등록
//				addStudent();
			} else if(intM == 2) {
				// 성적등록
				inputScore();
			} else if(intM == 3) {
				// 성적정보 열기
				readScore();
			} else if(intM == 4) {
				// 성적정보 저장
				saveScore();
			} else if(intM == 5) {
				// 성적정보 출력
				this.printScore();
			}
		}
		System.out.println("=".repeat(line));
		System.out.println("\t업무를 종료합니다!");
		System.out.println("\t\tBye Bye~");
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
	
}
