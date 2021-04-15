package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.model.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.StudentService;
import com.sk421120.standard.InputService;
import com.sk421120.standard.impl.InputServiceImplV1;

public class ScoreServiceImplV1 implements ScoreService {

	protected List<ScoreVO> scoreList;
	protected InputService inService;
	protected StudentService stService;
	protected Scanner scan;

	protected final Integer 국어 = 0;
	protected final Integer 영어 = 1;
	protected final Integer 수학 = 2;

	protected String[] subject;

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		inService = new InputServiceImplV1();
		stService = new StudentServiceImplV1();
		scan = new Scanner(System.in);
		
		subject = new String[] { "국어", "영어", "수학" };
	}

	@Override
	public void insertScore() {
		// TODO 학번, 국어, 영어, 수학 입력받기
		String num = this.inputNum();
		if (num == null) {
			return;
		}

		Integer[] scores = insertScore(num);
		if (scores == null) {
			return;
		}

		ScoreVO vo = new ScoreVO();
		vo.setNum(num);
		vo.setKor(scores[국어]);
		vo.setEng(scores[영어]);
		vo.setMath(scores[수학]);
		System.out.println(vo.toString());
		scoreList.add(vo);
	}

	private String inputNum() {

		String strNum = null;
		while (true) {

			Integer num = inService.inputValue("학번 5자리", 1);

			if (num == null) {
				return null;
			}
			strNum = String.format("%05d", num);
			
			if (strNum.length() > 5) {
				System.out.println("\t* 학번은 5자리 이하로 입력해주세요!");
				continue;
			}

			ScoreVO scoreVO = this.inputNum(strNum);
			if (scoreVO != null) {
				continue;
			}
			
//			if(this.inputNum(strNum)) continue;

			// 학번에 해당하는 점수가 없다. 중복아님
			// 학생정보에 등록된 학번인가 검사하여 학생정보가 없으면 다시 학번을 입력받고
			// 있으면 점수 입력하도록 break;
			
			StudentVO stVO = stService.getStudent(strNum);
			if(stVO == null) {
				System.out.println("학생정보가 없는 학생입니다.");
				System.out.println("학번을 다시 입력해주세요");
				continue;
			}
			
			System.out.println("=".repeat(50));
			System.out.printf("학번 %s\n", stVO.getNum());
			System.out.printf("이름 %s\n", stVO.getName());
			System.out.printf("학과 %s\n", stVO.getDept());
			System.out.printf("학년 %s\n", stVO.getGrade());
			System.out.printf("주소 %s\n", stVO.getAddress());
			System.out.println("=".repeat(50));
			System.out.println("학생정보가 맞습니까?");
			System.out.println("맞으면 Enter를 입력해주세요.");
			System.out.print(" >> ");
			String yesNo = scan.nextLine();
			if (yesNo.equals(""))
				break;
			else 
				continue;
		} // end while

		return strNum;
	}

	private ScoreVO inputNum(String num) {
		for (ScoreVO vo : scoreList) {
			if (vo.getNum().equals(num))
				System.out.println("\t* 중복된 학번이 있습니다.");
				return vo;
		}
		return null;
	}

	private Integer[] insertScore(String num) {
		System.out.printf("[ %s ] 학생의 점수를 입력해주세요.\n", stService.getStudent(num).getName() );
		Integer score[] = new Integer[subject.length];

		for (int i = 0; i < subject.length; i++) {
			score[i] = inService.inputValue(subject[i], 0, 100);
			if (score[i] == null) {
				return null;
			}
		}

		return score;
	}

	@Override
	public void loadScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO 학생정보와 성적정보 같이 출력하기
		System.out.println("=".repeat(100));
		System.out.println("학번\t이름\t학과\t학년\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(100));
		for(ScoreVO scVO : scoreList) {
			String strNum = scVO.getNum();
			StudentVO stVO = stService.getStudent(strNum);
			System.out.printf("%s\t", strNum );
			System.out.printf("%s\t", stVO.getName() );
			System.out.printf("%3s\t", stVO.getDept() );
			System.out.printf("%s\t", stVO.getGrade() );
			System.out.printf("%d\t", scVO.getKor() );
			System.out.printf("%d\t", scVO.getEng() );
			System.out.printf("%d\t", scVO.getMath() );
			System.out.printf("%d\t", scVO.getTotal() );
			System.out.printf("%3.2f\n", scVO.getAvg() );
		}
		System.out.println("=".repeat(100));

	}
}