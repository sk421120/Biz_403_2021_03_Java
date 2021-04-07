package com.callor.method;

import com.callor.method.service.ScoreServiceV6;

public class ScoreEx_06 {

	public static void main(String[] args) {
		ScoreServiceV6 sService = new ScoreServiceV6();
		while (true) {
			if (sService.inputScore() == null) {
				break;
			}
		}
		
		sService.printScore();
	}
}
