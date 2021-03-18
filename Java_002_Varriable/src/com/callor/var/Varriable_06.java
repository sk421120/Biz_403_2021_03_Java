package com.callor.var;

public class Varriable_06 {
	
	public static void main(String[] args) {
		
		int intNum = 0;
		// print intNum = 0, intNum = intNum + 1
		System.out.println( "숫자 : " + intNum + 1 );
		System.out.println( "숫자 intNum + 1 : " + (intNum + 1) );
		
		intNum = 0;
		System.out.println(intNum);
		
		System.out.println("증가");
		
		// 1
		//
		intNum += 1;
		System.out.println(intNum);
		//
		// = System.out.println( ++intNum );
		
		// 2
		intNum += 1;
		System.out.println(intNum);

		// 3
		intNum += 1;
		System.out.println(intNum);

		// 4
		//
		System.out.println(intNum);
		intNum += 1;
		//
		// = System.out.println( intNum++ );

	}

}
