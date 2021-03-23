package com.callor.apps;

/*
 * 5학급의 학생들에게 피자 간식을 지급
 * 학급의 인원 50 ~ 59
 * (학급 인원은 Random클래스)
 * 학급 인원수에 모자라지 않는 피자 주문(1판에 6조각)
 * 총 주문하는 피자판 수량 = 합 수량
 */
import java.util.Random;

public class App_04 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intClasses = new int[5];

		for (int i = 0; i < 5; i++) {
			// ( 0 ~ (?? - 1)) + @@
			// @@ : 시작값을 지정하는 형태 ( @@ ~ )
			intClasses[i] = rnd.nextInt(10) + 50;
		}
		
		// 학급별 주문수량을 계산하는 부분과 리스트를 출력하는 부분 분리
		// 1. 계산된 주문수량을 담아둘 장소 생성
		// 2. 저장된 주문수량을 사용하여 출력

		// 학급별 주문수량을 계산하여 저장할 배열
		int[] intOrders = new int[5];
		int pizzaPcs = 6;
		int intTotalOrder = 0;

		for (int i = 0; i < 5; i++) {
			intOrders[i] = intClasses[i] / pizzaPcs;

			// 인원수 대비 피자 조각수를 비교하여 부족할 경우 1box 추가하기
			if (intClasses[i] % pizzaPcs > 0) {
				intOrders[i]++;
			}

			intTotalOrder += intOrders[i];

		}
		System.out.println("****************************************");
		System.out.println("  Pizza\tPizza\tNyam  Nyam\tX)");
		System.out.println("========================================");
		System.out.println(" 순번  인원수\t 피자주문   전체조각 수");
		System.out.println("----------------------------------------");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%3d. \t%2d\t %5d\t%10d\n", i+1 , intClasses[i], intOrders[i], intOrders[i] * pizzaPcs);
		}
		System.out.println("========================================");
		System.out.println("전체 주문 BOX 수량 : " + intTotalOrder);

	}
}
