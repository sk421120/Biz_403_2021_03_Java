package com.callor.apps;

import java.util.Random;

/*
 * 배열에 저장된 값중에서 짝수가 저장된 최초의 위치는 어디인가
 */
public class App_04 {

	public static void main(String[] arg) {
		
		Random rnd = new Random();
		
		int[] intNums = new int[20];
		
		for(int i = 0 ; i < intNums.length ; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
		
		for(int i = 0 ; i < intNums.length ; i++) {
			if(intNums[i] % 2 == 0) {
				System.out.printf("첫번째 짝수의 위치는 %d번째! 값은 %d\n", i, intNums[i]);
				break;
			}
		}
	}
}
