package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

// V1에는 ScoreService 인터페이스가 impl 되어있기 때문에
// V1을 상속받으면 자동으로 인터페이스도 상속 받게된다
public class ScoreServiceV2 extends ScoreServiceImplV1 {

	/*
	 * scoreList에 성적정보를 추가할때 학번을 입력받을텐데
	 * 이미 등록된 학번 정보가 있으면 그 학번은 추가 하지 못하도록 하는 코드
	 * 
	 * V1의 inputNum() method를 재 정의 한다
	 * V1의 inputNum() method를 재 정의 하기 위하여 private > protected로 변경
	 */
	@Override
	protected String inputNum() {
		while (true) {
			Integer intNum = inService.inputValue("학번", 1);
			if (intNum == null) {
				return null;
			}
			String strNum = String.format("%06d", intNum);
			/*
			 * 생성한 strNum에 저장된 학번이 scoreList에 있는지 확인
			 */
			int index = 0;
			for (index = 0; index < scoreList.size(); index++) {
				ScoreVO vo = scoreList.get(index);
				if (vo.getNum().equals(strNum)) {
					break;
				}
			}
			if (index < scoreList.size()) {
				System.out.println(strNum + " 이미 입력된 학번입니다.");
				continue;
			}
			return strNum;
		}
	}

}
