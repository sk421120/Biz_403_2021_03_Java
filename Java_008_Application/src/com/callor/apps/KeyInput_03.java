package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		
		int num1 = 0;
		int num2 = 0;
		int lineLength = 52;
		
		System.out.println(LinesService.dLines(lineLength));
		System.out.println("\t정수 연산을 실행해보는 시간입니다!");
		System.out.println(" 2개의 정수를 키보드로 입력하고 Enter를 눌러주세요.");
		System.out.println(LinesService.sLines(lineLength));
		System.out.println("\t먼저 정수 1개를 입력해주세요");
		System.out.print("정수 1 >> ");
		num1 = scan.nextInt();
		System.out.println("\t다음 정수 1개를 입력해주세요");
		System.out.print("정수 2 >> ");
		num2 = scan.nextInt();
		System.out.println(LinesService.sLines(lineLength));
		System.out.printf(" 입력한 두 정수의 연산 결과입니다!\n", num1, num2);
		System.out.println(LinesService.sLines(lineLength));
		System.out.printf(" %d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf(" %d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf(" %d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf(" %d / %d = %3.3f\n", num1, num2, (float)num1 / num2);
		System.out.println(" " + num1 + " % " + num2 + " = " + (num1 % num2));
		System.out.println(LinesService.dLines(lineLength));
		
		
	}

}
