package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.LinesService;
import com.callor.apps.service.NumberServiceV1;

public class KeyInput_06 {

	public static void main(String[] args) {

		NumberServiceV1 nsV1 = new NumberServiceV1();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println(LinesService.dLines(50));
			System.out.println("  입력한 정수가 짝수, 소수인지 확인합니다!");
			nsV1.inputNum();
			nsV1.checkEven();
			nsV1.checkPrime();
			
			System.out.println(LinesService.dLines(50));
			System.out.print(" 계속할까요? (Yes : 1 / No : 0)\n >>");
			int yesno = scan.nextInt();
			if(yesno == 0) {
				System.out.println(" Bye Bye ~~");
				break;
			}
		}
	}

}
