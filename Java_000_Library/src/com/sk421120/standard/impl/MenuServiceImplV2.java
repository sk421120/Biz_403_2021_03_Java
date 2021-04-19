package com.sk421120.standard.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sk421120.standard.MenuService;

public class MenuServiceImplV2 implements MenuService {

	protected String title;
	protected List<String> menuList;
	protected Scanner scan;
	
	public MenuServiceImplV2(String title, List<String> menuList) {
		this.title = title;
		this.menuList = menuList;
		scan = new Scanner(System.in);
	}
	
	@Override
	public Integer selectMenu() {
		while (true) {
			// TODO 메뉴출력
			System.out.println("=".repeat(50));
			System.out.println(title);
			System.out.println("-".repeat(50));
			int nSize = menuList.size();
			for (int menuIndex = 0; menuIndex < nSize; menuIndex++) {
				System.out.printf("%d. %s\n", menuIndex + 1, menuList.get(menuIndex));
			}
			System.out.println("\t* QUIT. 종료");
			System.out.println("-".repeat(50));
			System.out.print("메뉴선택 >> ");
			String strM = scan.nextLine();
			if (strM.equals("QUIT")) {
				return null;
			}
			Integer intM = null;
			try {
				intM = Integer.valueOf(strM);
			} catch (NumberFormatException e) {
				System.out.printf("   메뉴는 1 ~ %d, 또는 QUIT만 입력하세요!\n", nSize);
				continue;
			}
			if(intM < 1 || intM > nSize) {
				System.out.printf("\t메뉴는 1 ~ %d 까지 선택하세요!\n", nSize);
				continue;
			}
			return intM;
		}
	}

}
