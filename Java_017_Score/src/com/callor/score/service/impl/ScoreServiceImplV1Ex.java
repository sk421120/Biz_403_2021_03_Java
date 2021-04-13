package com.callor.score.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.sk421120.standard.InputService;
import com.sk421120.standard.MenuService;
import com.sk421120.standard.impl.InputServiceImplV1;
import com.sk421120.standard.impl.MenuServiceImplV1;

public class ScoreServiceImplV1Ex extends ScoreServiceImplV1 {

	MenuService menuService;
	InputService inService;
	
	public ScoreServiceImplV1Ex() {
		inService = new InputServiceImplV1();
		
		/*
		 * MenuServiceImplV1 클래스의 생성자는
		 * 	두개의 매개변수(아규먼트, 파라메터)를 전달하면서 호출을 해야한다.
		 * 	첫번째 매개변수는 프로젝트의 title
		 * 	두번째 매개변수는 업무 리스트를 담을 List형 객체
		 * 
		 * title은 단순 문자열이기 때문에 바로 전달 할 수 있는데
		 * 	List형 객체는 List 객체를 생성하고, 데이터를 add 한 후
		 * 	전달해야 하므로 약간의 추가 연산코드가 필요하다
		 * 
		 * 이럴때는 생성자 method에서 작성하지 않고 객체를 사용하는 method에서 작성하는 것이 좋다.
		 */
		menuService = new MenuServiceImplV1(null, null);
	}

	@Override
	public void selectMenu() {
		String title = "대한 고등학교 성적처리 시스템 2021";
		List<String> menuList = new ArrayList<String>();
		menuList.add("학생정보 등록");
		menuList.add("성적등록");
		menuList.add("성적정보 열기");
		menuList.add("성적정보 저장");
		menuList.add("성적정보 출력");
		menuService = new MenuServiceImplV1(title, menuList);
		
		while (true) {
			Integer menu = menuService.selectMenu();
			if (menu == null) {
				return;
			}
			
			/*
			 * 만약 메뉴 변수의 값이 1일 때 menu가 1일 때 코드가 실행되고 코드가 종료되면
			 * 또다시 menu 값이 2인가, 3인가 검사하는 불필요한 코드가 실행된다.
			 */
			if (menu == 1) { }
			if (menu == 2) { }
			if (menu == 3) { }

			/*
			 * 만약 menu 변수의 값이 1이면 menu가 1일 때가 실행되고
			 * 	코드가 종료되면 else 이후의 코드는 무시하고 바로 if 문이 종료된다.
			 * 1번 코드에 비하면 약간이나마 효율적인 코드가 된다.
			 */
			if (menu == 1) {

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 5) {

			}
		}
	}
	
}
