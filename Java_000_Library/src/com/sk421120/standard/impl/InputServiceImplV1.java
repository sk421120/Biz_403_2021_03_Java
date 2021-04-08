package com.sk421120.standard.impl;

import java.util.Scanner;

import com.sk421120.standard.InputService;

/*
 * 인터페이스를 implements 한 클래스는 이름을 지을 때 접미사에 보통 Impl을 붙인다
 * 
 * 인터페이스를 impl 한 클래스는 인터페이스에 설계된 추상메서드를 "반드시" 구체적인 코드로 구현해야 한다
 * 
 * 만약 아직 구체적인 코드가 구현되지 않았더라도 method의 형태는 삭제할 수 없다.
 * 
 * 이러한 규칙을 적용하여 다른 클래스와 연동할 때 편리하고, 오류가 없도록 하기 위함
 */
public class InputServiceImplV1 implements InputService{
	
	protected Scanner scan;
	
	public InputServiceImplV1() {
		scan = new Scanner(System.in);
	}

	@Override
	public Integer inputValue(String title) {
		// TODO Prompt 타이틀을 보여주고 정수 입력받기
		while(true) {
			System.out.println(title + "값을 입력하세요. (중단 : QUIT)");
			System.out.print(" >> ");
			String strIn = scan.nextLine();
			if(strIn.equals("QUIT")) {
				System.out.println("입력을 중단합니다.");
				return null;
			}
			Integer intIn = null;
			try {
				intIn = Integer.valueOf(strIn);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("정수나 QUIT만 입력가능");
				continue;
			}
			return intIn;
		} // end while
	}

	@Override
	public Integer inputValue(String title, int start) {
		// TODO 시작값을 갖는 유효성 검사 추가한 method
		title = String.format("%s ( %d 이상 )", title, start);
		while(true) {
			// intIn에 저장된 값 == inputValue(String title)이 return 해준 값
			Integer intIn = this.inputValue(title);
			if(intIn != null) {
				if( intIn < start ) {
					System.out.printf("입력값은 %d 이상\n", start);
					continue;
				}
			}
			return intIn;
		} // end while
	}

	@Override
	public Integer inputValue(String title, int start, int end) {
		// TODO 제목, 시작값, 종료값으로 유효성 검사 method
		title = String.format("%s ( %d ~ %d )", title, start, end);
		
		while(true) {
			Integer intIn = this.inputValue(title);
			if(intIn != null) {
				if(intIn < start || intIn > end) {
					System.out.printf("값은 %d ~ %d 범위\n", start, end);
					continue;
				}
			}
			return intIn;
		} // end while
	}
}
