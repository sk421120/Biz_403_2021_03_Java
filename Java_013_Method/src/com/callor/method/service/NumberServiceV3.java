package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV3 {

//	protected Scanner scan;
//
//	public NumberServiceV3() {
//		scan = new Scanner(System.in);
//	}

	public Integer inputNum() {
		Scanner scan = new Scanner(System.in);

		Integer intNum = 0;
		while (true) {
			System.out.println("=".repeat(40));
			System.out.println("정수를 입력해주세요. (종료는 QUIT)");
			System.out.println("\t(정수의 범위 : 0 ~ 100)");
			System.out.println("-".repeat(40));
			System.out.print(" >> ");
			String strNum = scan.nextLine();
			if (strNum.trim().equals("QUIT")) {
				return null;
			} else {

				// 1. 입력된 값이 QUIT가 아니면 일단 정수로 바꿔보자
				try {
					intNum = Integer.valueOf(strNum);

					// 2. 정수이면 0 ~ 100까지 인지 알아보자
					if (intNum < 0 || intNum > 100) {
						System.out.println("범위 벗어남\n0~100까지 입력");
						continue;
					}
					return intNum;
				} catch (NumberFormatException e) {
					System.out.println("\t* 정수를 입력해주세요!");
					continue;
				}

//			if(intNum < 0 || intNum > 100) {
//				System.out.println("\t* 정수의 범위는 0~100 입니다!");
//				continue;
			}

//			return intNum;
		}
	}
}
