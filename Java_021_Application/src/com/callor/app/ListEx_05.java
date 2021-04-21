package com.callor.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx_05 {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> linkArr = new LinkedList<Integer>();
		
		// 무조건 끝에 추가하기
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		arr.add(500);
		
		view(arr);
		
		// 중간에 위치를 지정하여 추가하기
		// 	번호표
		linkArr.add(0, 100);
		linkArr.add(1, 200);
		linkArr.add(2, 300);
		linkArr.add(1, 400);
		linkArr.add(2, 500);
		linkArr.add(2, 600);
		
		view(arr);
	}
	
	public static List<Integer> view(List<Integer> intList) {
		return intList;
	}
}
