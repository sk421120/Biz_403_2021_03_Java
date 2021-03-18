package com.callor.var;

public class Varriable_08 {

	public static void main(String[] args) {
		
		int intSum = 0;
		int intNum = 1;
		
		// 1 ~ 10까지 덧셈을 수행
		
		/* intSum += intNum++;
		 * intSum = intSum + intNum++;
		 * 
		 * intSum = intSum + intNum;	(intSum = 0 + 1)
		 * intNum = intNum + 1;			(intNum = 0 + 1)
		 */
		
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		intSum += intNum++;
		
		System.out.println(intSum);
		
	}
}
