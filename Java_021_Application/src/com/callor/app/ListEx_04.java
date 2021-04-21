package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_04 {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 10 ; i++) {
			intList.add( rnd.nextInt(100) + 1 );
		}
		
		System.out.println(intList.toString());
		
		List<Integer> varList = new ArrayList<Integer>();
		varList.add(30);
		varList.add(35);
		varList.add(40);
		varList.add(45);
		varList.add(50);
		varList.add(55);
		varList.add(60);
		varList.add(65);
		varList.add(70);
		varList.add(75);
		
		intList.removeAll(varList);
		System.out.println(intList.toString());
		
		
		intList.add(99);	// 맨끝에 추가하기
		intList.add(3,9999);// 3번위치에 값 추가하기 [3]
		System.out.println(intList.toString());
		intList.set(4,5565);// 4번위치에 값 변경하기 [4]
		System.out.println(intList.toString());
		intList.add(4,4898);
		System.out.println(intList.toString());
		
		
		while(intList.size() > 0) {
			int index = rnd.nextInt(intList.size());
			
			System.out.println(intList.get(index));
			
			intList.remove(index);
		}
		
	}
}
