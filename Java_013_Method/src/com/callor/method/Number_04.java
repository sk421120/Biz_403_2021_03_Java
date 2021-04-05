package com.callor.method;

import com.callor.method.service.NumberServiceV3;

public class Number_04 {
	public static void main(String[] args) {
		NumberServiceV3 nsV3 = new NumberServiceV3();
		
		Integer intNum = nsV3.inputNum();
		
		if(intNum != null) {
			System.out.println("입력한 정수는 " + intNum + "입니다.");
		} else {
			System.out.println("\t종료");
		}
	}
}
