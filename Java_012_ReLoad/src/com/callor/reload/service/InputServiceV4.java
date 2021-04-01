package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV4 {

	protected Scanner scan;
	protected List<NumberVO> numList;

	public InputServiceV4() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}

	public void inputNum() {
		System.out.println("=".repeat(50));
		System.out.println(" 정수 2개를 입력해주세요.");
		System.out.println("-".repeat(50));
		Integer num1 = this.inputNum(1);

		Integer num2 = this.inputNum(2);

		NumberVO vo = new NumberVO();

		vo.setNum1(num1);
		vo.setNum2(num2);

		numList.add(vo);
	}

	public void printNum() {
		System.out.println("-".repeat(50));
		for (int i = 0; i < numList.size(); i++) {
			NumberVO vo = numList.get(i);
			System.out.println(" 입력한 정수값은 " + vo.getNum1() +	", " + vo.getNum2());
		}
		System.out.println("=".repeat(50));
	}

	public Integer inputNum(int num) {
		while (true) {
			try {
				System.out.printf(" 정수 %d >> ", num);
				String strNum = scan.nextLine();
				return Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println("\t* 정수값을 입력해주세요!");
				continue;
			}
		}
	}
}
