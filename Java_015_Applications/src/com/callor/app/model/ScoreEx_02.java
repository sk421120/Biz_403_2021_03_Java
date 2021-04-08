package com.callor.app.model;

import java.util.ArrayList;
import java.util.List;

import com.sk421120.standard.InputService;
import com.sk421120.standard.impl.InputServiceImplV1;

public class ScoreEx_02 {

	public static void main(String[] arg) {
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		InputService inService = new InputServiceImplV1();
		ScoreVO vo = new ScoreVO();
		vo.setNum("001");
		vo.setName("홍길동");
		vo.setKor(inService.inputValue("국어",0 , 100));
		vo.setEng(inService.inputValue("영어",0 , 100));
		vo.setMath(inService.inputValue("수학",0 , 100));
		scoreList.add(vo);
		
		/*
		 * VO 객체에 데이터를 저장하고 List에 추가하려고 하면 먼저 VO객체를 다시 생성해야 한다.
		 */
		vo = new ScoreVO();	// 매우 중요
		vo.setNum("002");
		vo.setName("성춘향");
		vo.setKor(inService.inputValue("국어",0 , 100));
		vo.setEng(inService.inputValue("영어",0 , 100));
		vo.setMath(inService.inputValue("수학",0 , 100));
		scoreList.add(vo);
		
		System.out.println(vo.toString());
		// List의 toString()은
		// list가 포함하고 있는 데이터(scoreVO)의 
		// 전체 리스트의 데이터를 확인하는 용도로 재 정의 되어 있다
		// 이때 반드시 VO클래스의 toString()도 재정의 되어 있어야 한다
		System.out.println(scoreList.toString());
	}
}
