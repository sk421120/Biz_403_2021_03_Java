package com.callor.app;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceV2Ex;

public class ScoreEx_02 {
	public static void main(String[] args) {
		ScoreService sService = new ScoreServiceV2Ex();
		sService.selectMenu();
	}
}
