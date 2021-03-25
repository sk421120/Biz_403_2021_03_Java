package com.callor.apps.service;

import java.util.Random;

public class PrimeServiceV2 {
	
	// 정수형 배열 선언
	int[] intNum;
	
	// 생성자 이용해서 정수형 배열 20 생성
	public PrimeServiceV2 () {
		intNum = new int[20];
	}
	
	// 정수형 배열 20에 난수 저장
	public void makeNums() {
		
		Random rnd = new Random();
		for(int i = 0 ; i < intNum.length ; i++) {
			intNum[i] = rnd.nextInt(51) + 50;
		}
	}
	
	public void printPrime() {
		
		for(int num : intNum) {
			
			int index = 0;
			for(index = 2 ; index < num ; index++) {
				if(num % index == 0) {
					break;
				}
			}
			// 중간에 break를 만났다
			// index == num
			if( index >= num ) {
				System.out.println(num + " 소수");
			}
			// index < num 소수가 아님을 출력
		}
		
	}

}
