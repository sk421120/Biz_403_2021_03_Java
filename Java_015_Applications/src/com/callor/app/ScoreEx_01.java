package com.callor.app;

import com.callor.app.model.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {
		ScoreVO scoreVO = new ScoreVO();
		
		scoreVO.setNum("001");
		scoreVO.setName("홍길동");
		scoreVO.setKor(90);
		scoreVO.setEng(80);
		scoreVO.setMath(97);
		
		System.out.println(scoreVO.toString());
		
	}
}
