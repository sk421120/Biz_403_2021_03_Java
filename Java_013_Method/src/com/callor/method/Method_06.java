package com.callor.method;

public class Method_06 {
	public static void main(String[] args) {
		
		String strNum = "101";
		Integer intNum = 0;
		
		/*
		 * 무조건
		 */
		if(intNum >= 0 && intNum <= 100) {
			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println(intNum);
		
		// 내가 비교하고자 하는 값은 먼저 만들고
		try {
			intNum = Integer.valueOf(strNum);
			if(intNum >= 0 && intNum <= 100) {
//				return intNum;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
