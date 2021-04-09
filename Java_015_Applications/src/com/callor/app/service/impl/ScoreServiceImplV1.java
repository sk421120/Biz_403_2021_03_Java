package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.sk421120.standard.InputService;
import com.sk421120.standard.impl.InputServiceImplV1;

/*
 * 1. 메뉴를 보여주고
 * 2. 성적입력 : 학생수의 제한이 없다.
 * 	학번
 * 	학생이름 inputName()
 * 	과목별 성적 inputScore()
 * 
 * 	학생성적입력 inputScore() 시작
 * 		- 학번입력
 * 		- 이름입력
 * 		- 점수입력
 * 
 * 	학생의 이름을 입력하는 inputName() method는 return type String 형이기 때문에
 * 	학생이름을 입력받고 입력받은 학생이름을 return한다
 * 	return 학생이름을 inputScore()에서 변수에 담아 처리를 할 수 있다.
 */
public class ScoreServiceImplV1 implements ScoreService {

	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	protected Scanner scan;
	
	// 저장소
	protected List<ScoreVO> scoreList;
	
	// 학번, 점수를 입력받을때 사용할 객체
	protected InputService inService;
	
	// 학생의 이름을 입력받을때 사용할 객체
	protected String[] subject;
	int line = 60;

	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceImplV1();
		subject = new String[] { "국어", "영어", "수학" };
	}

	@Override
	public void selectMenu() {
		while (true) {
			// TODO 성적처리 메뉴 선택
			System.out.println("=".repeat(line));
			System.out.println("\t자바 고교 성적처리 프로그램 V1");
			System.out.println("-".repeat(line));
			System.out.println("1. 학생 성적 입력하기");
			System.out.println("2. 학생 성적 리스트");
			System.out.println("\tQUIT 종료");
			System.out.println("-".repeat(line));
			System.out.print(" >> ");
			String strMenu = scan.nextLine();
			if (strMenu.equals("QUIT")) {
				break;
			}
			int menu = selectMenu(strMenu);
			if (menu == 1) {
				this.inputScore();
			} else if (menu == 2) {
				this.printScore();
			} else {
				System.out.println("\t* 메뉴를 다시 입력해주세요!");
			}

		} // end while
		System.out.println("=".repeat(line));
		System.out.println("\t업무를 종료합니다!");
		System.out.println("\t\tBye Bye~");
		System.out.println("=".repeat(line));
	}

	protected Integer selectMenu(String menu) {
		// TODO 메뉴선택 오류 잡기
		Integer intMenu = 0;
		try {
			intMenu = Integer.valueOf(menu);
		} catch (NumberFormatException e) {

		}
		return intMenu;

	}

	@Override
	public String inputName() {
		while (true) {
			// TODO 학생 이름 입력
			System.out.println("\t학생 이름을 입력해주세요.(중단 : QUIT)");
			System.out.print(" >> ");
			String name = scan.nextLine();
			if (name.equals("QUIT")) {
				return null;
			} else if (name.equals("")) {
				System.out.println("\t* 학생 이름을 입력해주세요!");
				continue;
			}
			System.out.println("-".repeat(line));
			return name;
		}
	}

	protected String inputNum() {
		// TODO 학생 학번 입력
		while (true) {
			String strNum = null;
			// 정수형 학번을 받는다
			Integer num = inService.inputValue("학번 6자리 이하", 1);
			// QUIT null 아닐때 
			if (num != null) {
				// 정수 학번을 문자열로 바꾼다
				strNum = String.format("%06d", num);
				// 문자열 학번이 6자리 이상일 때
				if (strNum.length() > 6) {
					System.out.println("\t* 올바른 학번 형식이 아닙니다!");
					continue;
					// 다시 학번 받도록 한다.
				}
				System.out.println("-".repeat(line));
			}
			// 학번이 중복이면
			if (inputNum(strNum)) {
				continue;
				// 다시 입력받게 한다
			}
			return strNum;
		}
	}

	protected boolean inputNum(String strNum) {
		// TODO 학번 중복 체크
		int nSize = scoreList.size();
		if (nSize != 0) {
			for (int i = 0; i < nSize; i++) {
				ScoreVO vo = scoreList.get(i);
				if (strNum.equals(vo.getNum())) {
					System.out.println("\t* 중복된 학번입니다.");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void inputScore() {
		// TODO 학번, 이름, 성적 입력받아 List에 추가
		Integer score[] = new Integer[subject.length];
		System.out.println("=".repeat(line));
		String num = this.inputNum();
		// num에 null값이 담겨있으면 종료하고 다시 메뉴로 돌아간다.
		if (num == null) {
			return;
		}
		String name = this.inputName();
		if(name == null) {
			return;
		}
		System.out.printf("입력하신 학생 [%s] [%s] 입니다.\n", num, name);
		System.out.println();
		System.out.printf("%s 학생의 국어, 영어, 수학 성적을 입력해주세요.\n", name);
		System.out.println("=".repeat(line));
		for (int i = 0; i < subject.length; i++) {
			score[i] = inService.inputValue(subject[i], 0, 100);
			if (score[i] == null) {
				return;
			}
			System.out.println("-".repeat(line));
		}
		
		// 입력을 모두 마쳤으면 VO에 담기
		ScoreVO vo = new ScoreVO();
		vo.setNum(num);
		vo.setName(name);
		vo.setKor(score[국어]);
		vo.setEng(score[영어]);
		vo.setMath(score[수학]);
		
		// vo에 담긴 데이터를 List저장소에 추가
		scoreList.add(vo);
	}
	

	@Override
	public void printScore() {
		// TODO 학생 성적 리스트 출력
		int nSize = scoreList.size();
		if (nSize < 1) {
			System.out.println("\n\t* 입력된 학생 성적이 없습니다.\n");
			return;
		}
		System.out.println("=".repeat(line));
		System.out.println("학번\t 이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(line));
		for (int i = 0; i < nSize; i++) {
			ScoreVO vo = scoreList.get(i);
			System.out.print(vo.getNum() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAvg() + "\n");
		}
		System.out.println("=".repeat(line));
	}

}
