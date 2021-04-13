package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.callor.score.service.model.ScoreVO;

public class ScoreServiceImplV3 extends ScoreServiceImplV2 {

	// V1, V2로 부터 다음 method를 상속받은 상태
	// selectMenu(),
	// inputScore(),
	// printScore(),
	// saveScore(),
	
	// readScore()
	
	/*
	 * sample_score.txt에서 성적데이터를 읽어서 scoreList에 담기
	 */
	@Override
	public void readScore() {
		String readFile = "src/com/callor/score/sample_score.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		/*
		 * List에 있는 removeAll() method는 2개의 list에 중복된 데이터가 있으면
		 * 중복된 데이터를 삭제하는 method
		 * List type에 데이터를 새로 추가하고자 할때는 기존의 데이터를 삭제하고 추가를 해야 한다
		 * 이때 사용하는 코드
		 * 
		 * 파일이나 데이터베이스에
		 */
		scoreList.removeAll(scoreList);
		
		
		try {
			fileReader = new FileReader(readFile);
			buffer = new BufferedReader(fileReader);
			while(true) {
				String reader = buffer.readLine();
				//if조건문에 대하여 실행할 명령문이 한줄만 있을 경우 {}를 생략 가능
				if(reader == null) break;
				
				String[] scores = reader.split(":");
				Integer intKor = Integer.valueOf(scores[1]);
				Integer intEng = Integer.valueOf(scores[2]);
				Integer intMath = Integer.valueOf(scores[3]);
				
				ScoreVO vo = new ScoreVO();
				vo.setNum(scores[0]);
				vo.setIntKor(intKor);
				vo.setIntEng(intEng);
				vo.setIntMath(intMath);
				scoreList.add(vo);
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
