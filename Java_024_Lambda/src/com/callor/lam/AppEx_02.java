package com.callor.lam;

import com.callor.lam.service.OnClickService;
import com.callor.lam.service.impl.OnClickServiceImplV1;

public class AppEx_02 {
	
	public static void main(String arg[]) {

		/*
		 * 아주 단순한 interface를 사용하여 아주 단순한 일을 수행하는 객체를 만들고 싶을때
		 * interface를 상속하여 클래스를 만들고 클래스를 사용하여 객체를 생성하고 객체의 method를 호출하여
		 * 일을 수행하는 복잡한 방법을 사용하고 싶지 않을때
		 */
		OnClickService os2  =  new OnClickService() {
			
			@Override
			public void onClick(String msg) {
				// TODO Auto-generated method stub
				System.out.println(msg);
			}
			
		};
		
		os2.onClick("sad sad coding 익명클래스");
		
		OnClickService on2 = (msg)->System.out.println(msg);
		
		on2.onClick("want to go home");
	}

}
