package com.callor.apps;

public class Pay_02 {

	public static void main(String[] args) {

		int nPay = 3_723_560;
		int nPaper = 50_000;

		for ( int i = 0 ; nPay > 0 ; i++) {

			int nCount = nPay / nPaper;
			System.out.printf("%6d원권 : %5d매\n", nPaper, nCount);
			nPay %= nPaper;

			// nPaper 2 또는 5로 나누기
			if( i % 2 == 0) {
				nPaper /= 5;
			} else {
				nPaper /= 2;
			}
		}
	}
}
