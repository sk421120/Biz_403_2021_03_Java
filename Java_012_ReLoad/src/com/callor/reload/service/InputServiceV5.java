package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.reload.model.NumberVO;

public class InputServiceV5 {
	
	protected Scanner scan;
	protected List<NumberVO> numList;
	
	public InputServiceV5() {
		scan = new Scanner(System.in);
		numList = new ArrayList<NumberVO>();
	}
	
	public void inputNum() {
		System.out.println("=".repeat(50));
		System.out.println(" 정수 2개를 입력해주세요.");
		System.out.println(" 처음 정수보다 두번째 정수가 작아야합니다!");
		System.out.println("-".repeat(50));
		Integer num1 = inputNum(1);		
		Integer num2 = checkNum(num1);
		
		NumberVO vo = new NumberVO();
		vo.setNum1(num1);
		vo.setNum2(num2);
		
		numList.add(vo);
	}
	
	public void printNum() {
		System.out.println("-".repeat(50));
		System.out.println(" 입력한 정수 값의 뺄셈 결과입니다. ");
		for(int i = 0 ; i < numList.size() ; i++) {
			NumberVO vo = numList.get(i);
			//System.out.println(vo.getNum1() + ", " + vo.getNum2());
			System.out.printf(" %d - %d = %d\n", vo.getNum1(), vo.getNum2(), vo.getNum1() - vo.getNum2() );
		}
		System.out.println("=".repeat(50));
	}

	public Integer inputNum(int index) {
		while(true) {
			try {
				System.out.printf(" 정수 %d >> ", index);
				String strNum = scan.nextLine();
				return Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println("\t* 정수를 입력해주세요!");
			}	
		}
	}
	
	public Integer checkNum(Integer num1) {
		while(true) {
			Integer num2 = inputNum(2);
			if(num2 < num1) {
				return num2;
			} else {
				System.out.printf("  * 처음 정수 %d 보다 작은 정수를 입력해주세요!\n", num1);
			}
		}
	}

}
