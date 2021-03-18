package com.callor.var;

public class Varriable_17 {

	public static void main(String[] args) {
		
		/*
		 * 변수를 어떤값으로 시작할까
		 * 변수 (저장된)값이 어떻게 변화할까
		 */
		int num1 = 0;
		
		num1 = 100;			// 100
		num1 = 200;			// 200
		num1 = 300;			// 300
		num1 = 100 * 200;	// 20000
		
		num1++;	// 1증가	20001
		++num1;	// 1증가	20002
		
		num1 += 50;			// 20002 + 50 = 20052
		
		int num2 = 3;
		num1 = (num2 += 10);// 3 + 10 = 13 > num2 > num1
		
		
	}
}
