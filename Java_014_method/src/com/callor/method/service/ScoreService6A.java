package com.callor.method.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.method.model.ScoreVO;

/*
 *  데이터를 입력(키보드, Random, 파일, 인터넷)
 *  	데이터를 VO에 담고
 *  입력된 데이터를 List에 추가
 *  
 *  	연산을 수행
 *  
 *  다시 List 저장
 *  데이터를 읽어
 *  	List에서 추출하여 VO에 담고
 *  출력
 */
public class ScoreService6A {

	// final 키워드를 부착한 변수 = 상수
	// 상수 = 한번 저장된 값을 변경할 수 없는 특별한 변수
	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	
	protected List<ScoreVO> scoreList;
	protected InputServiceV2 inService;
	
	protected String[] subject;
	
	public ScoreService6A() {
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceV2();
		
		subject = new String[] {"국어", "영어", "수학"};
	}
	
	public void inputScore() {
		
		for(int i = 0 ; i < 5 ; i++) {
			Integer[] scores = new Integer[subject.length];
			for(int sb = 0; sb < subject.length ; sb++) {
				scores[i] = inService.inputValue(subject[i],0,100);
				if(scores[i] == null) {
					return;
				}
			}
			ScoreVO scoreVO = new ScoreVO();
//			int sbIndex = 0;
			scoreVO.setKor(scores[this.국어]);
			scoreVO.setEng(scores[this.영어]);
			scoreVO.setMath(scores[this.수학]);
			scoreList.add(scoreVO);
		}
	}
	
	public void inputScore1() {
		for(int st = 0 ; st < 5 ; st++) {
			Integer intKor = inService.inputValue("국어",0,100);
			if(intKor == null) {
				return;
			}
			
			Integer intEng = inService.inputValue("영어",0,100);
			if(intEng == null) {
				return;
			}
			
			Integer intMath = inService.inputValue("수학",0,100);
			if(intMath == null) {
				return;
			}
			ScoreVO vo = new ScoreVO();
			vo.setKor(intKor);
			vo.setEng(intEng);
			vo.setMath(intMath);
			scoreList.add(vo);
		}
	}
	
	public void printScore() {
		int nSize = scoreList.size();
		
		System.out.println("=".repeat(50));
		for(int i = 0 ; i < subject.length ; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		System.out.println("-".repeat(50));
		
		for(int i = 0; i < nSize ; i++) {
			ScoreVO vo = scoreList.get(i);
			
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
		}
	}
}
