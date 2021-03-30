package com.callor.classes;

public class Value_03 {

	public static void main(String[] args) {
		
		int num1 = getInt();
		Integer num2 = getInteger();
	}
	// primitive type
	private static int getInt() {
		// method의 return type int형 일경우 아직 return할 값이 정해지지 않으면 0을 return
		return 100;
		// return 0;
	}
	
	// wrapper class
	private static Integer getInteger() {
		// method의 return type이 Integer형일 경우 아직 return 할 값이 정해지지 않으면 null return 가능
		return 100;
		// return null;
	}
}
