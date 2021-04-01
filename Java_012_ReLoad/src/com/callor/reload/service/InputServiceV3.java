package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV3 {

	Scanner scan;
	List<Integer> intList;

	public InputServiceV3() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
	}

	public void inputNum() {

		while (true) {
			System.out.println("정수 50~150까지 입력");
			System.out.print(" >> ");
			String strNum = scan.nextLine();
			Integer intNum = 0;
			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println("\t* 정수형 숫자로만 입력해주세요!");
				continue;
			}
			if (intNum < 50 || intNum > 150) {
				System.out.println("\t* 50~150까지 입력해주세요!");
			} else {
				intList.add(intNum);
				break;
			}
		}
	}
}
