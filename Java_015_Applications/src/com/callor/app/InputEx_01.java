package com.callor.app;

import com.sk421120.standard.InputService;
import com.sk421120.standard.impl.InputServiceImplV1;

public class InputEx_01 {

	public static void main(String[] arg) {
		InputService isV1 = new InputServiceImplV1();
		
		isV1.inputValue("컵라면");
		
//		System.out.println(isV1.toString());
	}
}
