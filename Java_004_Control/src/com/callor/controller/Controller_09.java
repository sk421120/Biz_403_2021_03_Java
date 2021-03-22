package com.callor.controller;

import java.util.Random;

/*
 *  0 ~ 100 까지 난수(임의의 숫자)를 생성하고 그 숫자가 짝수인가 판별하라
 */
public class Controller_09 {

	public static void main(String[] arg) {
		
		Random rnd = new Random();
		
		int num = rnd.nextInt(100);
		
		if( num % 2 == 0) {
			System.out.println(num + " 짝수");
		} else {
			System.out.println(num + " 짝수 아님");
		}
	}
}
