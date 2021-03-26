package com.callor.apps;

import java.util.Arrays;
import java.util.Scanner;

import com.callor.apps.service.LinesService;

public class KeyInput_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		int[] intNums = new int[5];
		int intSum = 0;
		int lineLength = 52;
		
		System.out.println(LinesService.dLines(lineLength));
		System.out.println(" 정수형 배열을 이용하여 5개의 정수의 합을 구합니다!");
		System.out.println(" \t정수를 입력하고 Enter를 눌러주세요.");
		System.out.println(LinesService.sLines(lineLength));
		
		for(int i = 0 ; i < intNums.length ; i++) {
			System.out.printf("\t%d번째 정수를 입력해주세요\n", i+1);
			System.out.printf(" 정수 %d >> ", i+1);
			intNums[i] = scan.nextInt();
		}
		System.out.println(LinesService.sLines(lineLength));
		System.out.println("\t입력한 정수와 합산 결과입니다!");
		
		// 정수 배열 출력
		//for(int i = 0 ; i < intNums.length ; i++) {
		//	System.out.printf(" %d번째 정수 : %d\n", i+1, intNums[i] );
		//}
		System.out.println(" " + Arrays.toString(intNums));
		// 1 + 2 + 3 + 4 + 5 = 결과
		for(int i = 0 ; i < intNums.length ; i++) {
			System.out.printf(" %d", intNums[i]);
			intSum += intNums[i];
			if(i+1 >= intNums.length) {
				System.out.println(" = " + intSum);
				break;
			}
			System.out.printf(" +");
		}
		System.out.println(LinesService.dLines(lineLength));

	}
}
