package com.callor.method.service;

import java.util.Scanner;

public class InputService {

	protected Scanner scan;

	public InputService() {
		scan = new Scanner(System.in);
	}

	public Integer inputValue(String title) {
		while (true) {
			System.out.println("=".repeat(50));
			System.out.printf("[%s] 의 값을 입력해주세요. (입력취소 : QUIT)\n", title);
			System.out.println("-".repeat(50));
			System.out.print(" >> ");
			String strInput = scan.nextLine();
			if (strInput.equals("QUIT")) {
				return null;
			} else {
				Integer intValue = null;
				try {
					intValue = Integer.valueOf(strInput);
				} catch (NumberFormatException e) {
					System.out.println("정수 또는 QUIT만 입력 가능합니다.");
					continue;
				}
				return intValue;
			}
		}
	}
}
