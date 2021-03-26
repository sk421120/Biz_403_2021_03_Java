package com.callor.apps;

import java.util.Scanner;

import com.callor.apps.service.ScoreServiceV1;

public class App_02 {

	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1();

		int num = 0;

		ssV1.inputScore();
		ssV1.makeSum();
		ssV1.makeAvg();
		ssV1.printScore();
		
		//ssV1.findMember();
		//ssV1.findScore();

		

	}

}
