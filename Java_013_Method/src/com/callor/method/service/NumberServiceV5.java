package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV5 extends NumberServiceV4 {

	protected Scanner scan;

	public NumberServiceV5() {
		scan = new Scanner(System.in);
	}

	public Integer inputNum(String title) {
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println(title + "값을 입력해주세요.");
			System.out.println("입력취소는 QUIT");
			System.out.println("값 범위 : 0~100");
			System.out.print(" >> ");
			Integer intInput = null;
			String strNum = scan.nextLine();
			
			if(strNum.trim().equals("QUIT")) {
				return intInput;
			}
			
			try {
				intInput = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("정수를 입력해주세요");
				continue;
			}
			
			if(intInput < 0 || intInput > 100) {
				System.out.println("값은 0~100 입력해주세요");
				continue;
			}
			return intInput;

		}
	}

}