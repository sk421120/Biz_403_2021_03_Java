package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV2;

public class ScoreEx_03 {

	public static void main(String[] arg) {
		ScoreService sService = new ScoreServiceImplV2();
		
		sService.selectMenu();
	}
}
