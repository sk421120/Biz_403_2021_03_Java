package com.callor.method;

import java.util.Scanner;

import com.callor.method.service.InputServiceV2;

public class NumberEx_03 {

	public static void main(String[] arg) {
		InputServiceV2 inService = new InputServiceV2();
//		inService.inputValue("밀크티");
//		inService.inputValue("흑당라떼", 100, 5000);
		inService.inputValue("달달커피", 500);
		
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		// scan.close();
		
	}
}