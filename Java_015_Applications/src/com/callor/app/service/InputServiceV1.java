package com.callor.app.service;

import java.util.Scanner;

public class InputServiceV1 {

	protected Scanner scan;

	public InputServiceV1() {
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {
		Integer intNum = null;
		while (true) {
			System.out.println("=".repeat(50));
			System.out.println(title + "값을 입력하세요. (종료 QUIT)");
			System.out.println("-".repeat(50));
			System.out.print(" >> ");
			String strInput = scan.nextLine();
			if (strInput.equals("QUIT")) {
				return null;
			}

			try {
				intNum = Integer.valueOf(strInput);
			} catch (NumberFormatException e) {
				System.out.println("\t* 숫자나 QUIT를 입력해주세요!");
				continue;
			}

			return intNum;
		}
	}

	public Integer inputValue(String title, int start) {
		title = String.format("%s (%d ~ )", title, start);
		while (true) {
			Integer retNum = this.inputValue(title);
			if (retNum == null) {
				return null;
			}
			if (retNum < start ) {
				System.out.printf("\t* 입력값 범위는 %d 이상 입니다!\n", start);
				continue;
			}
			return retNum;
		}
	}

	public Integer inputValue(String title, int start, int end) {

		title = String.format("%s (%d ~ %d)", title, start, end);

		while (true) {
			Integer retNum = this.inputValue(title);
			if (retNum == null) {
				return null;
			}
			if (retNum < start || retNum > end) {
				System.out.printf("\t* 입력값 범위는 %d ~ %d 입니다!\n", start, end);
				continue;
			}
			return retNum;
		}
	}

}
