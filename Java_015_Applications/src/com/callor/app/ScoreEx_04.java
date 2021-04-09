package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceV2;

public class ScoreEx_04 {

	public static void main(String[] arg) {
		ScoreService scService = new ScoreServiceV2();
		
		scService.selectMenu();
	}
}
