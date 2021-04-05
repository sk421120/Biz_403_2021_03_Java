package com.callor.method.service;

import java.util.Scanner;

public class NumberServiceV2 {

	/*
	 * 정수를 키보드에서 입력받아 정수를 return 하거나 (int) QUIT 를 입력하면 null을 return (Integer)
	 */
//	protected Scanner scan;

//	public NumberServiceV2() {
//		scan = new Scanner(System.in);
//	}

	public Integer inputNum() {
		Scanner scan = new Scanner(System.in);
//		String strNum = "";
//		Integer intNum = 0;
//		while (true) {
			System.out.println("=".repeat(45));
			System.out.println("정수 1개를 입력해주세요. (입력 취소 : QUIT)");
			System.out.println("( 정수의 범위는 0 ~ 100입니다.)");
			System.out.println("-".repeat(45));
			System.out.print(" >> ");
			String strNum = scan.nextLine();
			if (strNum.equals("QUIT")) {
				return null;
			} else {
				Integer intNum = Integer.valueOf(strNum);
				return intNum;
			}
			
//			try {
//				intNum = Integer.valueOf(strNum);
//			} catch (Exception e) {
//				System.out.println("\t* 정수를 입력해주세요!");
//				continue;
//			}
			
//			if(intNum < 0 || intNum > 100) {
//				System.out.println("\t* 정수의 범위는 0 ~ 100입니다!");
//				continue;
//			}
			
//			return intNum;
//		}
	}

}
