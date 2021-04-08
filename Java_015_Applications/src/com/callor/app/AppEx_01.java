package com.callor.app;

import com.callor.app.service.InputServiceV1;

public class AppEx_01 {

	public static void main(String[] arg) {
		InputServiceV1 inService = new InputServiceV1();
		
		String name = "연유라떼";
		Integer num = inService.inputValue(name, 100, 5000);
		if(num == null) {
			System.out.println("입력을 종료합니다.");
		} else {
			System.out.println(name + " : " + num);
		}
	}
}
