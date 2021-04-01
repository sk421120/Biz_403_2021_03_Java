package com.callor.reload.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeServiceV4 {

	protected Random rnd;
	protected List<Integer> primeList;
	
	public PrimeServiceV4() {
		rnd = new Random();
		primeList = new ArrayList<Integer>();
	}
	
	public void primeNum() {
		Integer[] rndNums = new Integer[50];
		for(int i = 0 ; i < 50 ; i++) {
			rndNums[i] = rnd.nextInt(51) + 50;
		}
		
		//for(int i = 0 ; i < rndNums.length ; i++) {
		for( Integer num : rndNums) {
			int index = 0;
//			for( index = 2 ; index < rndNums[i] ; index++) {
//				if(rndNums[i] % index == 0) {
			for( index = 2 ; index < num ; index++) {
				if(num % index == 0) {
					break;
				}
			}
			
			if( num <= index) {
				primeList.add(num);
//			if( rndNums[i] <= index ) {
//				primeList.add( rndNums[i] );
//				System.out.println(rndNums[i] + " 소수 맞음");
			}	
		}
	} // end primeNum()
	
	public void printPrimeNum() {
		System.out.println("50개의 난수 중 " + primeList.size() + "개의 소수 리스트입니다.");
		for(int i = 0 ; i < primeList.size() ; i++) {
			System.out.print(primeList.get(i) + "\t");
			if( (i+1) % 5 == 0 ) {
				System.out.println();
			}
		}
		
	}
}
