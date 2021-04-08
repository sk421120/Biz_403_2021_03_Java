package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV1;

public class ScoreEx_02 {
	public static void main(String[] args) {
		ScoreService scService = new ScoreServiceImplV1();
		
		scService.selectMenu();
//		scService.inputScore();
//		scService.printScore();
	}
}
