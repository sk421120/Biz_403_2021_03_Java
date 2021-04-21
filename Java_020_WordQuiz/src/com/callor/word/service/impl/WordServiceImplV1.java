package com.callor.word.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.word.domain.WordVO;
import com.callor.word.service.WordService;
import com.sk421120.standard.InputService;
import com.sk421120.standard.MenuService;
import com.sk421120.standard.impl.InputServiceImplV1;

public class WordServiceImplV1 implements WordService{

	protected InputService inService;
	protected MenuService mService;
	protected Scanner scan;
	protected List<WordVO> wordList;	// word들의 리스트
//	protected int nWordCount;
	protected Random rnd;
	
	protected final int 영어 = 0;
	protected final int 한글 = 1;
	
	// word.txt 파일을 기본으로 하여 객체생성을 하기 위한 생성자
	public WordServiceImplV1() {
		this("src/com/callor/word/word.txt");
	}
	
	// 객체를 생성할 때 파일 이름을 전달하여 word 파일을 지정하기
	public WordServiceImplV1(String wordFile) {
		inService = new InputServiceImplV1();
		scan = new Scanner(System.in);
		rnd = new Random();
		
		wordList = new ArrayList<WordVO>();
		this.loadWords(wordFile);
		
		// nWordCount는 wordList의 size를 담고 있을 변수인데 가급적 값을 setting하는 코드를
		// 쉽게 발견할 수 있도록
//		nWordCount = wordList.size();
	}
	
	protected void loadWords(String wordFile) {
		// TODO word.txt 파일을 읽어 wordList 만들어 두기
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);
			
			while(true) {
				String reader = buffer.readLine();
				
				if(reader == null) break;
				
				String words[] = reader.split(":");
				
				WordVO wordVO = new WordVO();
				wordVO.setEnglish(words[영어]);
				wordVO.setKorea(words[한글]);
				wordList.add(wordVO);
			}
			
			// 여기에서 wordList size를 계산하여 nWordCount 변수에 담을 수도 있지만
			// 복잡한 코드 속에 있는 관계로 코드가 세팅되는 것을 보기가 다소 불편하여 생성자 부분으로 이동
//			nWordCount = wordList.size();
			
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/*
	 * 게임이 시작되면
	 * 1. wordList에서 임의 단어 1개을 추출하고
	 * 2. 단어의 영문 스펠을 나누어
	 * 3. 무작위로 섞고
	 * 4. 섞인 단어를 보여주고
	 * 5. 맞추기
	 */
	
	public void startGame() {
		/*
		 * shuffleWord() method가 return하는 shuffle된 영단어를
		 * 그대로 inputWord(String[] viewWord)에게 넘겨준다
		 * 
		 * inputWord()를 호출하고
		 * 다시 shuffleWord() 호출하여 수행할 수 있는 코드를
		 * 
		 * shuffleWord()를 호출하여 데이터만(섞인 영단어) 되돌려 받고
		 * 다시 그 데이터를 inputWord()에 전달하여 수행하는 코드로 변경
		 * 
		 * 첫번째 방법은 inputWord()와 shuffleWord()가 결합도가 높아져
		 * 한 method의 코드를 변경하면 다른 코드도 변경해야하는 부분이 많아진다
		 * 
		 * 두번째 방법은 데이터만 연결된 형태로 변경한 것으로 한 method의 코드를 변경하여도
		 * 다른 method코드는 변경학지 않아도 되는 구조가 되었다.
		 * 
		 * 첫번째 코드는 결합도가 높은 코드
		 * 두번째 코드는 결합도는 낮추고 응집도를 높인 코드가 된다
		 * 
		 * SW공학에서 좋은 코드라고 하는 예 이다.
		 */
		
		// String viewWord[] = this.viewWord();
		
		this.inputWord( this.shuffleWord() );
		
	}
	
	// viewWord를 shuffleWord()로 변경
	// 1. wordList에서 단어를 한개 추출하고
	// 2. shuffleEnglish() 에게 단어를 전달하고
	// 		shuffle 된 알파벳 배열을 return받아 
	protected String[] shuffleWord() {
		// Random 클래스를 사용한 코드가 
		// starGame(), suffleWord() method에 나타났다
		// Random 클래스를 사용한 객체 선언을
		// 필드(멤버, 클래스)영역으로 보내고 초기화
//		Random rnd = new Random();
		
		// wordList의 개수(size)를 담을 변수를 두개의 method에서 
		int nWordCount = wordList.size();
		
		// 0 ~ wordList() -1 범위의 임의 정수 만들기
		int nWordIndex = rnd.nextInt(nWordCount);

		// 생성된 index값으로 wordList중에 단어 1개를 추출하여 wordVO에 담기
		WordVO wordVO = wordList.get(nWordIndex);
				
		// 영문단어 알파벳을 뒤섞기 코드를 method로 분리하고
		// 원래 영문단어를 매개변수로 전달하고 뒤섞인 단어를 return 받아 shuffleEnglish에 저장
		String[] shuffleEnglish = this.shuffleWord(wordVO.getEnglish());
		
//		System.out.println( wordVO.getEnglish() );
//		System.out.println(Arrays.toString(shuffleEnglish));
		
		return shuffleEnglish;
		
	}
	
	protected String inputWord(String[] viewWord) {
		System.out.println("=".repeat(50));
		System.out.println("뤼팡의 영단어 게임 V1");
		System.out.println("-".repeat(50));
		System.out.println("다음 단어의 순서를 맞춰보세요!");
		// shuffle된 영단어 보여주기
		System.out.println(Arrays.toString(viewWord));
		
		System.out.print(" >> ");
		String strInput = scan.nextLine();
		
		return strInput;
	}
	
	/*
	 * 영문단어를 매개변수로 받아서 알파벳단위로 자르고 뒤섞어 배열로 만든 후 return
	 */
	protected String[] shuffleWord(String strWord) {
		
		// 영문단어를 스펠링 단위로 잘라서 배열로 생성
		String word[] = strWord.split("");		
		
		int nCount = word.length;
		
		// 몇번 섞을래? (1000번 섞기)
		// ( shuffle )
		for(int i = 0 ; i < 100 ; i++) {
			// 임의의 index값 2개를 만들고
			int index1 = rnd.nextInt(nCount);
			int index2 = rnd.nextInt(nCount);
			
			// index1에 저장된 값과, index2에 저장된 값을 바꾸기
			String tmp = word[index1];
			word[index1] = word[index2];
			word[index2] = tmp;
		}
		
		return word;
	}
	
}