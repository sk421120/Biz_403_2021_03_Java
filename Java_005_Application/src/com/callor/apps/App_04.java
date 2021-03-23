package com.callor.apps;

import java.util.Random;

public class App_04 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intMembers = new int[5];

		for (int i = 0; i < 5; i++) {
			intMembers[i] = rnd.nextInt(10) + 50;
		}

		int[] pizzaBox = new int[5];
		int pizzaPcs = 6;
		int intSum = 0;

		for (int i = 0; i < 5; i++) {
			pizzaBox[i] = intMembers[i] / pizzaPcs;

			if (intMembers[i] % pizzaPcs > 0) {
				pizzaBox[i]++;
			}

			intSum += pizzaBox[i];

		}

		System.out.println("=====================================");
		System.out.println(" 인원수\t 피자주문\t전체조각 수");
		System.out.println("-------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.printf(" %3d\t %3d\t\t %4d\n", intMembers[i], pizzaBox[i], pizzaBox[i] * pizzaPcs);
		}
		System.out.println("=====================================");
		System.out.println("전체 주문 BOX 수량 : " + intSum);

	}
}
