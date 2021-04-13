package com.callor.score.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.callor.score.service.Values;
import com.callor.score.service.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1 {

	protected Scanner scan;

	public ScoreServiceImplV2() {
		scan = new Scanner(System.in);
	}

	@Override
	public void inputScore() {
		Integer intNum = inService.inputValue("학번", 1);
		if (intNum == null) {
			return;
		}
		String strNum = this.inputScore(intNum);

		String strName = this.inputScore(strNum);
		if(strName == null) {
			return;
		}
		Integer[] score = new Integer[subject.length];
		
		for( int i = 0; i < subject.length; i++) {
			score[i] = inService.inputValue(subject[i], 0,100);
			if(score[i] == null) {
				return;
			}
		}

		ScoreVO vo = new ScoreVO();
		vo.setNum(strNum);
		vo.setName(strName);
		vo.setIntKor(score[Values.국어]);
		vo.setIntEng(score[Values.영어]);
		vo.setIntMath(score[Values.수학]);
		scoreList.add(vo);
		
	}

	protected String inputScore(Integer intNum) {
		return String.format("%06d", intNum);
	}

	protected String inputScore(String strNum) {
		while (true) {
			System.out.printf("[ %s ] 이름을 입력해주세요. (중단 : QUIT)\n", strNum);
			System.out.print(" >> ");
			String name = scan.nextLine();
			if (name.equals("QUIT")) {
				return null;
			}
			if(name.equals("")) {
				System.out.println("\t* 이름은 필수항목입니다!");
				continue;
			}
			return name;
		}
	}

	@Override
	public void printScore() {
		int nSize = scoreList.size();
		System.out.println("=".repeat(line+10));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(line+10));
		for(int i = 0 ; i < nSize ; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.println(vo.printLine());
		}
		System.out.println("=".repeat(line+10));
	} // end printScore()

	@Override
	public void saveScore() {
		String fileName = null;
		while(true) {
			System.out.println("저장할 파일 이름을 입력하세요.");
			System.out.print(" >> ");
			fileName = scan.nextLine();
			if(fileName.equals("QUIT")) {
				return;
			}
			if(fileName.equals("")) {
				System.out.println("   * 파일이름은 반드시 입력해주시길 바랍니다.");
				continue;
			}
			break;
		}
		
		String strFileName = "src/com/callor/score/" + fileName + ".txt";
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		try {
			fileWriter = new FileWriter(strFileName);
			out = new PrintWriter(fileWriter);
			
			int nSize = scoreList.size();
			for(int i=0; i < nSize; i++) {
				ScoreVO vo = scoreList.get(i);
				out.print(vo.getNum() + "\t");
				out.print(vo.getName() + "\t");
				out.print(vo.getIntKor() + "\t");
				out.print(vo.getIntEng() + "\t");
				out.print(vo.getIntMath() + "\t");
				out.print(vo.getTotal() + "\t");
				out.printf("%3.2f\n",vo.getAvg());
			}
			
			out.flush();
			out.close();
			
			System.out.println("성적 저장 완료");
		} catch (IOException e) {
			System.out.println("저장실패");			
		}
		
	}
	
}
