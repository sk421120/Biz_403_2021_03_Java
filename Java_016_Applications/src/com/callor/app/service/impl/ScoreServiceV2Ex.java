package com.callor.app.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.callor.app.service.Values;
import com.callor.app.service.model.ScoreVO;

/*
 * selectMenu는 그대로 활용
 * inputScore() 만 다시 작성
 */
public class ScoreServiceV2Ex extends ScoreServiceImplV2 {
	
//	protected String[] subject;
//	
//	public ScoreServiceV2Ex() {
//		subject = new String[] { "국어", "영어", "수학"};
//	}
	
	@Override
	public void inputScore() {
		Integer intNum = inService.inputValue("학번", 1);
		if( intNum == null) {
			return;
		}
		// 1을 입력했으면 000001로 만들어라
		String strNum = String.format("%06d", intNum);
		
		String strName = null;
		
		while (true) {
			System.out.println(strNum + "학생의 이름 입력(중단 : QUIT)");
			strName = scan.nextLine();
			if (strName.equals("QUIT")) {
				return;
			} else if (strName.equals("")) {
				System.out.println("학생 이름은 반드시 입력하세요");
				continue;
			} 
			break;
		}
		
		// 각 과목의 점수를 별도로 입력받아 변수에 저장하기를 하려고 하니 귀찮다
		// 창조적 게으름을 피워보기
		
		// 입력받을 과목명을 배열 변수로 선언하고
//		String[] subject = {"국어", "영어", "수학"};
		// subject 배열을 멤버영역으로 이동 subject로
		// 점수를 입력하는 곳에서 사용하기 위하여 과목명 담을 배열을 선언했는데 생각해보니
		// 	다른 method에서도 사용할 수 있을것 같다 >> 클래스 영역으로 이동
		
		// 과목수 만큼 점수를 저장할 배열을 선언
		Integer[] intScore = new Integer[subject.length];
		
		for(int i = 0; i < subject.length; i++) {
			intScore[i] = inService.inputValue(subject[i],0,100);
			if( intScore[i] == null) {
				return;
			}
		}
		
		ScoreVO scoreVO = new ScoreVO();
		scoreVO.setNum(strNum);
		scoreVO.setName(strName);
		// 과목명, 과목점수가 담긴 배열에 대한 위치를 숫자로 사용하지 않고
		// 명명된 이름으로 사용하기 위하여 배열의 index 값을 상수로 선언해 둔다 (final)
		scoreVO.setKor(intScore[국어]);
		scoreVO.setEng(intScore[영어]);
		scoreVO.setMath(intScore[수학]);
		
		// 디버깅 코드, VO에 담긴 데이터 확인하기
//		System.out.println("=".repeat(line));
//		System.out.println(scoreVO.toString());
//		System.out.println("=".repeat(line));
		scoreVO.setKor(intScore[Values.국어]);
		scoreVO.setEng(intScore[Values.영어]);
		scoreVO.setMath(intScore[Values.수학]);
		scoreList.add(scoreVO);
		
	}

	@Override
	public void printScore() {
		System.out.println("빛나라 고교 성적리스트 2021");
		System.out.println("=".repeat(line+10));
		System.out.print("학번\t이름\t");
		for(int index = 0 ; index < subject.length ; index++) {
			System.out.print(subject[index] + "\t");
		}
		System.out.println("총점\t평균");
		System.out.println("-".repeat(line+10));
		
		int nSize = scoreList.size();
		for(int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		System.out.println("=".repeat(line+10));
		
	}

	@Override
	public void saveScore() {
		while (true) {
			System.out.println("성적리스트 저장");
			System.out.println("저장할 파일 이름을 입력하세요.");
			System.out.print(" >> ");
			String strFileName = scan.nextLine();
			if (strFileName.equals("")) {
				System.out.println("파일 이름을 입력해야합니다.");
				continue;
			}
			
			FileWriter fileWriter = null;
			PrintWriter out = null;
			
			strFileName = "src/com/callor/app/" + strFileName + ".txt";
			
			try {
				fileWriter = new FileWriter(strFileName);
				out = new PrintWriter(fileWriter);
				
				int nSize = scoreList.size();
				/*
				 * 파일에 저장할 때 각 데이터를 컴마(,)로 구분하여 입력하고
				 * 파일이름을 *.csv로 저장하면 excel에서 파일을 읽을 수 있다
				 * 
				 * 	csv : comma-separated-variables
				 * 	컴마로 값을 구분한 파일
				 */
				for(int i = 0 ; i < nSize; i ++) {
					ScoreVO vo = scoreList.get(i);
					out.print(vo.getNum()+ ",");
					out.print(vo.getName()+ ",");
					out.print(vo.getKor()+ ",");
					out.print(vo.getEng()+ ",");
					out.println(vo.getMath());
				}
				out.flush();
				out.close();
				System.out.println(strFileName + " 저장완료");
			} catch (IOException e) {
				System.out.println("파일을 생성 할 수 없습니다.");
				System.out.println("파일 이름을 다시 입력해 주세요.");
				continue;
			}
			break;
			
		}
	}

}
