package com.callor.apps.service;

import java.util.Scanner;

public class NumberServiceV1 {
	
	int intNum = 0;
	Scanner scan;
	
	public NumberServiceV1() {
		scan = new Scanner(System.in);
	}
	
	public void inputNum() {
		
		//Scanner scan = new Scanner(System.in);
		System.out.println(LinesService.dLines(50));
		//System.out.println("  입력한 정수가 짝수, 소수인지 확인합니다!");
		System.out.println("  정수를 하나를 입력하고 Enter를 눌러주세요.");
		System.out.println(LinesService.sLines(50));
		System.out.printf(" >> ");
		intNum = scan.nextInt();
		
		
		// main() method가 아닌 곳에서 Scanner 사용하는 경우 사용이 끝나면 close()를 하자
		// 이제는 Scanner 사용이 끝났으니 Resource(자원)을 반납하겠다.
		//scan.close();
		
	}
	
	public void checkEven() {
		System.out.println(LinesService.sLines(50));
		System.out.printf(" 입력한 정수 %d(은)는",intNum);
		if(intNum % 2 == 0) {
			System.out.println(" 짝수입니다!");
		} else {
			System.out.println(" 짝수가 아닙니다!");
		}
	}
	
	public void checkPrime() {
		System.out.println(LinesService.sLines(50));
		System.out.printf(" 입력한 정수 %d(은)는",intNum);
		int num = 0;
		for( num = 2 ; num < intNum ; num++) {
			if(intNum % num == 0) {
				break;
			}
		}
		if( num < intNum ) {
			System.out.println(" 소수가 아닙니다!");
		} else {
			System.out.println(" 소수입니다!");
		}
	}

}
