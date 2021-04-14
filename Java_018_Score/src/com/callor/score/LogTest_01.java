package com.callor.score;

import com.callor.score.service.LogService;

public class LogTest_01 {

	public static void main(String[] arg) {
		String strNum = "100";
		String strNum1 = "100A";
		
		try {
			Integer intNum = Integer.valueOf(strNum);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			LogService.log(strNum + " 숫자로 변환 불가");
		}
		
		try {
			Integer intNum1 = Integer.valueOf(strNum1);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			LogService.log(strNum1 + " 숫자로 변환 불가");
		}
	}
}
