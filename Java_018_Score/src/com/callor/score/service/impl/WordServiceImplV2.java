package com.callor.score.service.impl;

import java.util.Arrays;
import java.util.Random;

import com.callor.score.model.WordVO;

public class WordServiceImplV2 extends WordServiceImplV1 {

	@Override
	public void viewWord() {
		int wCount = 0;
		int lCount = 0;
		while (true) {
			WordVO word = this.getWord();
			int nCount = 0;

			String strEng = word.getEnglish();
			String[] strWords = strEng.split("");
			String[] rndWords = this.randomWord(strWords.clone());

			int tCount = 0;
			while (true) {
				System.out.println("=".repeat(50));
				System.out.println(word.getKorea());
				System.out.println("뜻을 가진 단어는 무엇일까요?\n\t(중단 : Quit)");
				System.out.println("-".repeat(50));
				System.out.println(Arrays.toString(rndWords));
				System.out.println("-".repeat(50));
				System.out.print(" >> ");
				String strInput = scan.nextLine();

				
				if (strInput.equalsIgnoreCase("Quit")) {
					System.out.println("총 문제 : " + (wCount+lCount));
					System.out.println("맞춘 문제 : " + wCount);
					System.out.println("틀린 문제 : " + lCount);
					return;
				}

				if (strInput.contentEquals(word.getEnglish())) {
					System.out.println("맞았습니다.");
					wCount++;
					break;
				} else {
					System.out.println("틀렸습니다.");
					System.out.println((nCount + 1) + "번째 는 " + strWords[nCount++] + " 입니다.");
				}
				if (nCount + 1 > strWords.length) {
					
					break;
				}
				tCount++;
			}
			if(tCount > 1) {
				System.out.println(tCount + " 번 시도했습니다.");	
			}
			System.out.println(word.getEnglish() + " : " + word.getKorea() + " 입니다.");

		}
	}

	private String[] randomWord(String[] word) {
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			int index = rnd.nextInt(word.length);
			int index1 = rnd.nextInt(word.length);

			String temp = word[index1];
			word[index1] = word[index];
			word[index] = temp;
		}
		return word;
	}

}
