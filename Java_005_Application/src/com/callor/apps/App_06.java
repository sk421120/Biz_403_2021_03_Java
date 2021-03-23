package com.callor.apps;

public class App_06 {

	public static void main(String[] args) {
		
		int money = 3723560;
		
		int[] intNum = new int[8];
		
		// 5만원권 개수 저장
		intNum[0] = money / 50000;
		// 나머지
		money %= 50000;
		
		
		// 만원
		intNum[1] = money / 10000;
		money %= 10000;
		
		// 오천원
		intNum[2] = money / 5000;
		money %= 5000;
		
		// 천원
		intNum[3] = money / 1000;
		money %= 1000;
		
		intNum[4] = money / 500;
		money %= 500;
		
		intNum[5] = money / 100;
		money %= 100;
		
		intNum[6] = money / 50;
		money %= 50;
		
		intNum[7] = money / 10;
		money %= 10;
		
		intNum[8] = money / 5;
		money %= 5;
		
		for(int i = 0 ; i < 8 ; i++) {
			int num = i+1;
			for(int tmp = 0 ; tmp < 4 ; tmp++) {
				num *= 10;
			}
			
			if( i % 2 == 0) {
				intNum[i] = money / 5 * num;
			} else {
				intNum[i] = money / 1 * num;
			}
			
		}
		
		for(int i = 0 ; i < 8 ; i++) {
			System.out.println(intNum[i]);
		}
	}
}
