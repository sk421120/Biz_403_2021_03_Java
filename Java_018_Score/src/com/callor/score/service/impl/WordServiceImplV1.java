package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.model.WordVO;
import com.callor.score.service.WordService;

public class WordServiceImplV1 implements WordService {

	protected List<WordVO> wordList;
	protected Scanner scan;
	protected final Integer 영어 = 0;
	protected final Integer 한글 = 1;
	
	public WordServiceImplV1() {
		wordList = new ArrayList<WordVO>();
		scan = new Scanner(System.in);

		// word.txt 파일을 읽어서 wordList 데이터를 생성하는 method를 생성자에서 호출하여
		// 이 클래스(WordService...V1)를 생성하면 자동으로 실행되어 wordList 데이터를 준비하도록 하자
		this.loadWord();
	}

	@Override
	public void loadWord() {
		// TODO word.txt 파일을 읽어서 wordList 만들기
		String wordFile = "src/com/callor/score/word.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);

			String read = new String();

			int nCount = 0;
			while ((read = buffer.readLine()) != null) {
				String[] word = read.split(":");

				WordVO vo = new WordVO();
				vo.setEnglish(word[영어]);
				vo.setKorea(word[한글]);
				vo.setCount(++nCount);
				wordList.add(vo);
			}

			buffer.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 여는 동안 문제 발생");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일에서 데이터 읽는 동안 문제 발생");
		}

	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub
		for (int i = 0; i < wordList.size(); i++) {
			WordVO vo = wordList.get(i);
			System.out.println(vo.toString());
		}

	}

	@Override
	public void viewWord() {
		// TODO wordList에 담긴 데이터중 임의 데이터 1개 추출
		int nWinCount = 0;
		int nLoseCount = 0;
		while (true) {
			WordVO vo = this.getWord();
			
			// System.out.println(vo.toString());
			System.out.println("=".repeat(50));
			System.out.println("다음 뜻과 같은 영어단어는? (중단:Quit)");
			System.out.println(vo.getKorea());
			System.out.println("=".repeat(50));
			System.out.print(" >> ");
			String strKor = scan.nextLine();
			if (strKor.equals("Quit")) {
				break;
			}
			if (strKor.equalsIgnoreCase(vo.getEnglish())) {
				System.out.println("맞췄습니다!");
				nWinCount++;
			} else {
				System.out.println("틀렸습니다.");
				nLoseCount++;
			}
			System.out.println(vo.toString());
		}
		System.out.println("=".repeat(50));
		System.out.println("맞은 개수 : " + nWinCount);
		System.out.println("틀린 개수 : " + nLoseCount);
		System.out.println("=".repeat(50));

	}

	protected WordVO getWord() {
		Random rnd = new Random();
		int nSize = wordList.size();
		int index = rnd.nextInt(nSize) + 1;

		WordVO wordVO = wordList.get(index);

//		System.out.println(wordVO.toString());
		return wordVO;
	}

}
