package com.callor.method;

import com.callor.method.service.NumberServiceV5;

public class Method_07 {
	public static void main(String[] args) {
		NumberServiceV5 nsV5 = new NumberServiceV5();

		Integer price = nsV5.inputNum("컵누들");
		if ( price != null) {
			System.out.println("컵누들의 가격은 " + price + "원 입니다.");
		} else {
			System.out.println("종료");
		}
//		if(nsV5.inputNum("컵누들") == null) {
//			System.out.println("종료");
//		}
	}
}
