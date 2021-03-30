package com.callor.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class_03 {

	public static void main(String[] arg) {
		
		/*
		 * Generic 사용 : <자료형>
		 * List 형 객체에 저장할 데이터의 type을 제한하므로써
		 * 코드의 실행에 효율을 높이고,
		 * 메모리 사용의 효율을 높이기 위함
		 */
		List<Integer> divisor = new ArrayList<Integer>();
		Random rnd = new Random();
		int intNum = rnd.nextInt(51) + 50;
		
		for(int i = 2 ; i < intNum ; i++) {
			if(intNum % i == 0) {
				divisor.add(i);
			}
		}
		
		System.out.println("난수 : " + intNum);
		System.out.println("약수들의 리스트");
		
		for(int i = 0 ; i < divisor.size() ; i++) {
			System.out.println(divisor.get(i));
		}
		
	}
}
