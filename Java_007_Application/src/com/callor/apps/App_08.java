package com.callor.apps;

import com.callor.apps.service.ScoreServiceV1;

public class App_08 {
	
	public static void main(String[] args) {
		
		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		
		ssV1.makeScore();
		ssV1.makeSum();
		ssV1.makeAvg();
		ssV1.printScore();
		System.out.println(ssV1.sLine);
		ssV1.makeScoreSum();
		ssV1.makeTotal();
		ssV1.printTotal();
		System.out.println(ssV1.dLine);
	}

}
