package com.callor.classes;

import java.util.Random;

public class Class_01 {
	
	public static void main(String[] arg) {
		
		Random rnd = new Random();
		
		int rndNum = rnd.nextInt(51) + 50;
		int iCount = 0;
		
		// i 값이 2에서 시작하여 1씩 증가하면서
		// rndNum 미만일 경우 {} 명령들을 실행하라
		// i 값은 2 ~ (rndNum - 1) 연속으로 생성
		for(int i = 2 ; i < rndNum ; i++) {
			if(rndNum % i == 0 ) {
				iCount++;
			}
		}
		
		int[] intNums = new int[iCount];
		iCount = 0;
		
		for(int i = 2 ; i < rndNum ; i++) {
			if(rndNum % i == 0 ) {
				intNums[iCount++] = i;
			}
		}
		
		System.out.println("=============================");
		System.out.printf(" %d의 약수 리스트\n",rndNum);
		System.out.println("-----------------------------");	
		for(int i = 0 ; i < intNums.length ; i++) {
			System.out.printf(" %d의 약수는 %d\n", rndNum, intNums[i]);
		}
		System.out.println("=============================");
	}

}
