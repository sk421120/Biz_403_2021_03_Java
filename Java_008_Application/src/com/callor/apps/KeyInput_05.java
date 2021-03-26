package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_05 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int intNum = 0;
		int lineLength = 50;
		
		System.out.println(LinesService.dLines(lineLength));
		System.out.println("  입력한 정수가 짝수, 소수인지 확인합니다!");
		System.out.println("  정수를 하나를 입력하고 Enter를 눌러주세요.");
		System.out.println(LinesService.sLines(lineLength));
		System.out.printf(" >> ");
		intNum = scan.nextInt();
		System.out.println(LinesService.sLines(lineLength));
		
		System.out.printf(" 입력한 정수 %d(은)는",intNum);
		if(intNum % 2 == 0) {
			System.out.println(" 짝수입니다!");
		} else {
			System.out.println(" 짝수가 아닙니다!");
		}
		
		// 소수 판별을 하는 2~(자신-1) 수로 나누었을때
		// 나머지가 0인 경우가 한번도 없어야 된다.
		System.out.printf(" 입력한 정수 %d(은)는",intNum);
		int temp = 0;
		for(temp = 2 ; temp < intNum ; temp++ ) {
			if( intNum % temp == 0) {
				break;
			}
		}
		if(temp < intNum) {
			System.out.println(" 소수가 아닙니다!");
		}
		else {
			System.out.println(" 소수입니다!");
		}
		System.out.println(LinesService.dLines(lineLength));
		
	}

}