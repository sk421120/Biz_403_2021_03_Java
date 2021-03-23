package com.callor.apps;

import java.util.Random;

/*
 * 25 ~ 50명 인원 있는 각 반에 pizza 간식을 지급하려고 한다.
 * 각 반의 학생들에게 pizza 1 조각씩 지급하려고 한다
 * 학생수보다 부족하거나 6조각 이상 남지 않도록 pizza를 주문해야 한다
 * 몇 박스의 pizza를 주문해야하는지 코드로 주문하시오
 */
public class App_01 {

	public static void main(String[] arg) {

		Random rnd = new Random();

		rnd.nextInt();	// -2 ** 31 ~ 2 ** 31 -1 중의 수
		rnd.nextInt(10);// 0 ~ 9 중의 수

		// 25 ~ 50의 수 중에서 1개를 만들어라
		int intMembers = rnd.nextInt(26) + 25;	// 25 ~ 50
		int intPizza = 0;
		
		// 정수 / 정수 ==> 몫이 몇개인가
		// 필요한 box 수와 같거나 작은 값 이 만들어진다

		/*
		 * intPizza = intMembers / 6;
		 * boolean bYes = intMembers % (intPizza * 6) == 0;
		 * if ( !bYes )	{	intPizza++;	}
		 */
		if (intMembers % 6 == 0) {
			intPizza = intMembers / 6;
		} else {
			intPizza = intMembers / 6 + 1;
		}

		System.out.println("==========================");
		System.out.printf("반의 총 학생 : %2d 명\n", intMembers);
		System.out.printf("주문할 피자  : %2d 판\n", intPizza);
		System.out.println("==========================");

	}
}
