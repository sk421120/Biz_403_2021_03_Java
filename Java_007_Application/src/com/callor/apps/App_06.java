package com.callor.apps;

import com.callor.apps.service.EvenServiceV2;

public class App_06 {
	
	public static void main(String[] args) {
		
		EvenServiceV2 esV2 = new EvenServiceV2();
		
		esV2.makeNums();
		System.out.println("===========================================");
		System.out.println("\t\t배열의 짝수");
		System.out.println("-------------------------------------------");
		esV2.printEven();
		System.out.println("-------------------------------------------");
		System.out.print(" 짝수들의 합 : ");
		esV2.sumEven();
		System.out.println("===========================================");
	}

}
