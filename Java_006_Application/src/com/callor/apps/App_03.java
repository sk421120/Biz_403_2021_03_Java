package com.callor.apps;

import java.util.Random;

public class App_03 {

	public static void main(String[] arg) {

		Random rnd = new Random();

		int[] intNums = new int[20];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}

		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] % 2 == 0) {
				// 몇번째 위치(요소, 첨자)에 저장되어 있나?
				System.out.printf("배열의 [%2d]값은 짝수 %3d\n", i, intNums[i]);
			}
		}

	}
}
