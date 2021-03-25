package com.callor.apps.service;

import java.util.Random;

// 클래스 선언문(시작하는 곳)
public class EvenServiceV1 {

	// 정수형 배열 변수 선언
	int[] intNums;

	/*
	 * 생성자 method 클래스를 선언하면 자동으로 만들어지는 method
	 * 별도의 코드가 필요없으면 만들지 않아도 된다
	 * 
	 * new EvenServiceV1() 코드에서 호출되는 method
	 * 생성자 method에는 클래스영역의 변수들을 초기화 생성하기 위한 코드들이 작성된다
	 */
	// 생성자로 정수형 배열 100 생성
	public EvenServiceV1() {
		intNums = new int[100];
	}

	/*
	 * 1시간에 90km를 갈수있는 속도로 달려라
	 * 90km/h 속도로 달려라
	 */
	// 정수형 배열 100에 난수(1~100) 저장
	public void makeNums() {
		Random rnd = new Random();
		// intNums 배열 개수만큼 코드를 반복실행하라
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}
	}

	/*
	 * 짝수(Even) 홀수(Odd)
	 */
	// 정수형 배열 100에 짝수 출력
	public void printEven() {
		int count = 0;
		
		System.out.println("===========");
		System.out.println("짝수들 리스트");
		System.out.println("===========");
		
		// intNums 배열 전체를 뒤져서 짝수가 있으면 출력하라
		for (int arr = 0; arr < intNums.length; arr++) {
			if (intNums[arr] % 2 == 0) {
				System.out.printf("%3d ",intNums[arr]);
					count++;
				if( count % 10 == 0) {
					System.out.print("\n");
					
				}
			}
		}
		System.out.println();
		System.out.println("===========");
		System.out.println("짝수들 개수 : " + count);
	}

	// 정수형 배열 100에 짝수들의 합 출력
	public void sumEven() {
		int intSum = 0;
		for (int arr = 0; arr < intNums.length; arr++) {
			if (intNums[arr] % 2 == 0) {
				intSum += intNums[arr];
			}
		}
		System.out.println(intSum);
	}
}
