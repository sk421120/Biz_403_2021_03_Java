package com.callor.method;

import com.callor.method.service.InputServiceV1;
import com.callor.method.service.ScoreServiceV1;

public class NumberEx_02 {
	public static void main(String[] args) {
		InputServiceV1 isV1 = new InputServiceV1();

		// 문자열 1개만 전달하여 method 호출
		// 문자열을 전달받아 값을 입력받아 결과를 return
//		isV1.inputValue("진라면");
		
		// 문자열 1개와 정수 2개를 전달하여 method 호출
		// 2개의 정수 범위 내의 값이 입력되었는지 유효성 검사 수행
//		isV1.inputValue("진라면", 50, 1000);
		
//		System.out.println( isV1.inputValue("정수") );
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		ssV1.inputScore();
	}
}
