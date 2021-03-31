package com.callor.classes;

import java.util.Scanner;

public class ScannerEx_04 {

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);

		System.out.println("2개의 숫자를 입력합니다 (중단 : quit)");
		System.out.print(" 숫자 1 >> ");
		String strNum = scan.nextLine();

		if (strNum.equals("quit")) {
			return;
		}

		try {
			Integer intNum = Integer.valueOf(strNum);

			System.out.println("입력할 숫자의 제곱 : " + intNum * intNum);
		} catch (Exception e) {
			System.out.println("입력한 값이 숫자가 아니어서 계산 할 수 없음");
		}

	}
}
