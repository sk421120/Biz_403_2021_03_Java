package com.callor.score;

import com.callor.score.service.WordService;
import com.callor.score.service.impl.WordServiceImplV1;

public class WordEx_01 {

	public static void main(String[] args) {
		WordService wService = new WordServiceImplV1();
		
		wService.viewWord();
	}
}
