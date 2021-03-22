package com.callor.controller;

import java.util.Random;

public class Controller_11 {

	public static void main(String[] arg) {

		Random rnd = new Random();

		for (int i = 0; i < 5; i++) {
			
			// 0 ~ (100-1) 까지 만들고 1을 더하여 num에 저장하라 한 명령문으로
			int num = rnd.nextInt(100) + 1;
			// num = rnd.nextInt(100);
			// num = num + 1;

			if (num % 3 == 0) {
				System.out.println(num + " 는(은) 3의 배수");
			} else {
				System.out.println(num + " 는(은) 3의 배수 아님");
			}

		}
	}
}
