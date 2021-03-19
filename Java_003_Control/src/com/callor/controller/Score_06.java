package com.callor.controller;

public class Score_06 {

	public static void main(String[] arg) {
		
		int intKor = 90;
		int intEng = 88;
		int intMath = 66;
		
		int intSum = intKor + intEng + intMath;
		float floatAvg = (float)intSum / 3;
		
		System.out.println(floatAvg);
		
		if(floatAvg >= 95 ) {
			System.out.println("★★ 장원입니다! ★★");
		} else if( floatAvg >= 90) {
			// 95 > ?? >= 90
			System.out.println("축하합니다. 차석입니다.");
		} else if( floatAvg >= 80) {
			System.out.println("수고하셨습니다. 우등입니다.");
		} else if( floatAvg >= 60) {
			System.out.println("앗! 아차상입니다.");
		} else { // if floatAvg < 60
			System.out.println("아쉽게도 낙방입니다.");
		}
		
	}
}
