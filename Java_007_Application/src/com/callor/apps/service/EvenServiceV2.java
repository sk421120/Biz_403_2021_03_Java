package com.callor.apps.service;

/*
 * 자바프로그래밍에서 상속
 * V2 클래스에서는 V1클래스를 상속했다
 * 
 * V1에 작성한(선언한) 변수, method 코드를 그대로 이어받아서 사용하겠다.
 * 
 * V1에 작성된 method들의 코드를 그대로 사용하면서 일부 method의 코드를
 * 	변경, 확장, 기능개선을 하여 내 프로젝트에 적용하겠다
 * 
 */

import java.util.Random;

// extends 클래스의 상속(확장)
public class EvenServiceV2 extends EvenServiceV1 {

	// 생성자로 정수형 배열 100 생성
	public EvenServiceV2() {
		intNums = new int[100];
	}

	// 정수형 배열 100에 난수(1~100) 저장

	// 정수형 배열 100에 짝수 출력
	public void printEven() {
		int nCount = 0;
		
		// intNums 배열 전체를 뒤져서 짝수가 있으면 출력하라
		for (int arr = 0; arr < intNums.length; arr++) {
			if (intNums[arr] % 2 == 0) {
				System.out.printf("%4d ",intNums[arr]);
				nCount++;
				if( nCount % 5 == 0) {
					System.out.print("\n");
				}
			}
			
		}
		System.out.println();
	}

	
}
