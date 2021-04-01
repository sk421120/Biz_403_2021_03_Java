package com.callor.reload.service;

import java.util.Random;

public class PrimeServiceV1 {
	
	protected Random rnd;

	public PrimeServiceV1() {
		rnd = new Random();
	}
	
	public void primeNum() {
		int rndNum = rnd.nextInt(51) + 50;
		int index = 0;
		System.out.println("생성된 난수 : " + rndNum);
		/*
		 * for() 반복문이 실행되거나 끝나는 경우
		 * 비교문 "i < rndNum" true인 동안 반복
		 * 만약 rndNum 10이다. i == 9 일때가지 반복하라
		 * for() 반복문이 종료되면 i 은 얼마일까?
		 * i 값이 rndNum 보다 작으면 { } 내의 코드 실행
		 * { } 실행 후에 i++를 실행
		 * i 가 9가 되었을때 { } 을 실행하고 다시한번 i++ 실행된다.
		 * 때문에 for() 반복문이 중단되지 않고 모두 정상 수행이 되면 i == rndNum
		 * i < rndNum 인지 묻는것 > false가 되어 종료
		 * 
		 * 만약 for() 반복문이 중간에 break를 만났다
		 * 	"i 값은 항상 rndNum 보다 작다"
		 */
		for(index = 2 ; index < rndNum ; index++) {
			// 소수가 아닌경우
			// rndNum % i 가 한번이라도 0이면 그 수는 소수가 아닌경우
			// 그렇다면 그 이후에는 더이상 연산을 할 필요가 없다.
			if( rndNum % index == 0 ) {
				break;
			}
		} // for() end
		// 여기에서 for() 반복문이 break 되었냐? >> 소수 아님
		// 아니면 모두 완료되었냐?	>> 소수
		
		System.out.print("소수 : ");
		if(index < rndNum) {
			System.out.print("X");
		} else {
			System.out.print("O");
		}
		
		
	}

}
