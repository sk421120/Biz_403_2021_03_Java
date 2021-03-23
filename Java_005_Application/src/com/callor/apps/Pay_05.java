package com.callor.apps;

/*
 * 스위치변수
 * 	연산이 "2가지" 경우에 서로 달리 수행해야 할 경우
 * 	변수에 1로 시작하고 코드내에서 변수에 -1 곱하는 코드를 추가하고
 * 	변수값이 "> 0" 또는 "< 0" 경우를 비교연산을 수행하여 코드를 간소화 할 수 있게 하는 방법
 * 
 * for() { } : 반복되는 횟수가 처음에 정해진 경우
 * while() { } : 반복되는 횟수가 정해지지 않고 어떤 조건에 맞추어서 반복이 수행되는 경우
 */
public class Pay_05 {

	public static void main(String[] args) {

		int nPay = 3_723_560;
		int nPaper = 50_000;

		int sw = 1;
		//for ( ; ; ) {
		// while(조건) { }
		// 조건 = 비교연산문이 true인 동안 무한 반복 실행하는 반복문
		while(nPay > 0) {
			int nCount = nPay / nPaper;
			System.out.printf("%6d원권 : %5d매\n", nPaper, nCount);
			nPay %= nPaper;

			// nPaper 2 또는 5로 나누기
			if( sw > 0) {
				nPaper /= 5;
			} else {
				nPaper /= 2;
			}
			sw *= -1;
		}
	}
}
