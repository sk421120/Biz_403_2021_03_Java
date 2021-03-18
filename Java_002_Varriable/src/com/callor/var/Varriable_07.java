package com.callor.var;

public class Varriable_07 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		// intSum = intSum + ++intNum
		// intSum = intSum + (intNum + 1)
		intSum += ++intNum;
		// intNum 1
		// intSum 1
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		intSum += ++intNum;
		System.out.println(intSum);
	}
}
