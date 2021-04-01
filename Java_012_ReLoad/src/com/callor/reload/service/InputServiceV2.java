package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputServiceV2 {

	protected Scanner scan;
	protected List<Integer> intList;

	// 클래스 영역에 선언된 변수는 멤버변수라고 하고
	// 멤버변수는 이 클래스의 어떤 method에서든지 자유롭게 접근하여 저장, 읽기가 가능
	int num;
	
	public InputServiceV2() {
		scan = new Scanner(System.in);
		intList = new ArrayList<Integer>();
		
		// method의 { } 에 선언된 변수는 지역변수 라고 한다
		// 지역변수는 { } 벗어나면 변수가 소멸
		// { } 이 서로 다르면 이름은 같아도 절대 접근이 불가
		// 멤버변수에 같은 이름의 변수가 있는데 지역변수에 같은 이름으로 변수를 또 선언하면
		// 	멤버변수는 감춰져서 접근이 불가능
		String num;
	}

	public void inputNum() {
		System.out.println("=".repeat(50));
		System.out.println(" 정수 하나를 입력해주세요");
		System.out.println(" ( 50 ~ 150의 범위의 정수만 가능합니다.)");
		this.addNum();
		System.out.println( intList.get(0) ); 
	}

	public void addNum() {
		while (true) {
			System.out.print(" 정수 >> ");
			int num = scan.nextInt();
			if (num < 50 || num > 150) {
				System.out.println("\t* 50 ~ 150 정수를 입력해주세요!");
				continue;
			}
			intList.add(num);
			return;
		}
	}

}
