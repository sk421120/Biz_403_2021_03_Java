package com.callor.var;

public class Varriable_19 {

	public static void main(String[] args) {
		
		// Console에 숫자 0이 무한 반복 출력
		// 무한 반복 코드에 "조건을 부여"하여 유한 반복 되도록 변경하기
		// for() 명령에 조건부여하기, 두번째 명령구간에 비교연산자를 추가
		int intNum = 0;
		for( ; intNum < 10 ; ) {
			System.out.println(++intNum);
		}
		System.out.println();
		
		intNum = 0;
		for( ; intNum < 10; ) {
			intNum += 2;
			System.out.println(intNum);
		}
		System.out.println();
		
		intNum = 1;
		for( ; intNum < 10; ) {
			intNum += 2;
			System.out.println(intNum);
		}
		System.out.println();
		
	}
}
