package com.callor.apps;

import java.util.Random;

/*
 * 20개의 정수 배열에 50~100의 난수를 저장하고
 * 소수 값 리스트 출력
 */
public class App_01B {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[20];

		// 20개의 정수 배열 난수
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(51) + 50;
		}

		// 소수 판별
		for (int arr = 0; arr < intNums.length; arr++) {
			
			int num = 0;
			int numP = intNums[arr];
			for(num = 2 ; num < numP ; num++) {
				if(numP % num == 0) {
					break;
				}
			}
			
			if(num < numP) {
				System.out.println(numP + " 소수가 아님");
			} else {
				System.out.println(numP + " 소수");
			}
		}
	}
}
