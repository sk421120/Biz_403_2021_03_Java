package com.callor.values;

public class Values_06 {
	
	public static void main(String[] arg) {
		
		// 33을 2로 나눈 나머지
		System.out.println("33 % 2 = " + 33 % 2);
		
		// 나머지가 1인가? == true
		System.out.println("나머지가 1인가? \n" + ( 33 % 2 == 1 ) );
		
		// 나머지가 0인가? == false
		System.out.println("나머지가 0인가? \n" + ( 33 % 2 == 0 ) );
		System.out.println();
		
		// 어떤 수를 2로 나누어서 나머지가 0이면 그 수는 짝수이고,  그렇지 않으면 그 수는 홀수이다.
		
		System.out.println("33은 짝수인가? 홀수인가? \n" + ( 33 % 2  == 0 ? "짝수" : "홀수" ) );
		
		System.out.println("\n>> 과정");
		System.out.println("33 % 2 연산 결과 : " + 33 % 2 );
		System.out.println("연산 결과 == 0 ? : " + ( 33 % 2 == 0) );
		System.out.println("짝수인가 홀수인가? " + ( 33 % 2 == 0 ? "짝수" : "홀수"));
		System.out.println();
		// 연산 ? true일때 : false일때
		
		System.out.println("33이 10보다 " + ( 33 > 10 ? "크다\n" : "작다\n") );
		
		// 삼항연산자
		// 비교 ? true : false 와 같이 항목 3가지가 구분되어 있는 연산
		System.out.println("3 == 3 연산이 true인가? " + ( 3 == 3 ? "맞다\n" : "아니다\n" ) );
		
		
	}

}
