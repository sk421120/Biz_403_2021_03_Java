package com.callor.apps;

public class App_06A {
	
	public static void main(String[] args) {
		
		int intNum = 3_385_859;
		/*
		 * intNum의 자릿수가 얼마인가?
		 */
		int nCount = 0;
		while(intNum > 0) {
			
			nCount++;
			// intNum = intNum % 10
			// intNum 값과 10을 나머지 연산을 수행하면 intNum / 10 => 3385859 / 10 = 338585
			intNum /= 10;
			System.out.println(intNum);
			
			//while() { } 반복문을 끝내기 위한 비교 연산명령문
			// 반대로 while 명령문 조건 실행
			//if(intNum <= 0) { 
			//	break;
			//}
		}
		
		System.out.println(intNum + " 는 " + nCount + "자릿수");
	}
}