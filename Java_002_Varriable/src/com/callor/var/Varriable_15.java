package com.callor.var;

public class Varriable_15 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 0;
		
		// intSum += (intNum += 1) * 2;	intNum이 1부터 시작하니 5줄
		// intSum += (intNum++) * 2;	intNum이 0부터 시작하니 6줄
		// intSum += (++intNum) * 2; 	intNum이 1부터 시작하니 5줄
		
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		intSum += (intNum += 2);
		
		System.out.printf("0부터 10까지 짝수의 합 : %d", intSum);
	}
}
