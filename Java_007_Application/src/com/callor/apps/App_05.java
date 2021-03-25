package com.callor.apps;

import com.callor.apps.service.EvenServiceV1;

public class App_05 {

	public static void main(String[] args) {

		EvenServiceV1 esV1 = new EvenServiceV1();

		esV1.makeNums();
		System.out.println("===========================================");
		System.out.println("\t\t배열의 짝수");
		System.out.println("-------------------------------------------");
		esV1.printEven();
		System.out.println("-------------------------------------------");
		System.out.print(" 짝수들의 합 : ");
		esV1.sumEven();
		System.out.println("===========================================");
	}
}