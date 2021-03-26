package com.callor.apps;

import java.util.Random;
import java.util.Scanner;

/*
 * 임의의 1 ~ 10까지 정수 1개를 만들고 키보드로 숫자를 입력받아서
 * 임의로 생성된 정수를 맞추는 게임
 */
public class KeyInput_07 {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rndNum = rnd.nextInt(10) + 1;
		
		int nCount = 1;
		
		System.out.println(" * 1 부터 10까지 정수 맞추기 *");
		while(true) {
			System.out.println(" 1부터 10까지 정수를 입력하세요!");
			System.out.print(" >> ");
			int inputNum = scan.nextInt();
			
			if(inputNum == rndNum) {
				System.out.printf(" 정답입니다! %d번 시도에 맞췄습니다!\n", nCount);
				System.out.print(" 계속할까요? ( Yes : 1 / No : 0 )\n >> ");
				int yesNo = scan.nextInt();
				if(yesNo == 0) {
					System.out.println(" Bye Bye~~");
					break;
				} else {
					nCount = 1;
					rndNum = rnd.nextInt(10) + 1;
					System.out.println();
				}
			} else if(inputNum < rndNum) {
				System.out.println(" 입력한 수보다 큽니다!");
				nCount++;
			} else if(inputNum > rndNum) {
				System.out.println(" 입력한 수보다 작습니다!");
				nCount++;
			}
		}
	}

}
