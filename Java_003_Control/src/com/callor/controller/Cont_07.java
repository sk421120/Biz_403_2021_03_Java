package com.callor.controller;

public class Cont_07 {

	public static void main(String[] arg) {
		
		int intNum = 11;
		
		intNum = 9;
		
		// int i = 2 ~ intNum 7 까지
		// 7/2, 7/3, 7/4, 7/5, 7/6 나머지연산
		
		for( int i = 2 ; i < intNum ; i++) {
				System.out.printf("%d = %d\n", i, intNum % i);
		}
		
		// 2 ~ (intNum에 담긴 정수 -1까지) 반복
		// intNum에 담긴 값을 2~(intNum-1)가지 값으로 나누었을때 나머지가 0인 경우가 있냐?
		
		intNum = 15;
		
		for(int index = 2 ; index < intNum ; index++) {
			//System.out.println(index + " " + (intNum % index == 0) );
			System.out.print(index + " " + (intNum % index == 0 ? "<< 소수가 아님 " : " ") );
		}
	}
}
