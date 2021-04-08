package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;
import com.sk421120.standard.InputService;
import com.sk421120.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected final int 국어 = 0;
	protected final int 영어 = 1;
	protected final int 수학 = 2;
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	protected InputService inService;
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
			// TODO 메뉴 출력
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

	private Integer selectMenu(String menu) {
		Integer intMenu = 0;
		try {
			intMenu = Integer.valueOf(menu);
		} catch (NumberFormatException e) {

		}
		return intMenu;

	}

	@Override
	public String inputName() {
		// TODO 학생 이름 입력
		System.out.println("\t학생 이름을 입력해주세요.");
		System.out.print(" >> ");
		String name = scan.nextLine();
		System.out.println("-".repeat(line));
		return name;
	}

	private String inputNum() {
		// TODO 학생 학번 입력
		String strNum = null;
		while (true) {
			Integer num = inService.inputValue("학번 6자리", 0);
			if (num != null) {
				strNum = Integer.toString(num);
				if (strNum.length() < 6) {
					System.out.println("\t* 올바른 학번 형식이 아닙니다!");
					continue;
				}
				System.out.println("-".repeat(line));
			}
			if (inputNum(strNum)) {
				continue;
			}
			return strNum;
		}
	}

	private boolean inputNum(String strNum) {
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
		// TODO 학생 성적 입력
		Integer score[] = new Integer[subject.length];
		System.out.println("=".repeat(line));
		String num = this.inputNum();
		if (num == null) {
			return;
		}
		String name = this.inputName();
		System.out.printf("입력하신 학생 [%s] [%s] 입니다.\n", num, name);
		System.out.println("=".repeat(line));
		System.out.printf("%s 학생의 국어, 영어, 수학 성적을 입력해주세요.\n", name);
		System.out.println("=".repeat(line));
		for (int i = 0; i < subject.length; i++) {
			score[i] = inService.inputValue(subject[i], 0, 100);
			if (score[i] == null) {
				return;
			}
			System.out.println("-".repeat(line));
		}
		ScoreVO vo = new ScoreVO();
		vo.setNum(num);
		vo.setName(name);
		vo.setKor(score[국어]);
		vo.setEng(score[영어]);
		vo.setMath(score[수학]);
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
