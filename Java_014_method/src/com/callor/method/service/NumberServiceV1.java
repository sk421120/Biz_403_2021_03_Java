package com.callor.method.service;

import java.util.Scanner;

/*
 * 함수형 프로그래밍 언어( 또는 구조적 프로그래밍 언어)에서는
 * 	한개의 모듈(파일) 또는 한 프로젝트에서 같은 이름의 함수를 선언 할 수 없다
 * 
 * 객체지향 프로그램언어( java에서는)
 * 	한개의 클래스(파일)내에서 같은 이름의 함수(method)를 중복 선언 할 수 있다.
 * 	한개의 클래스에서 method를 중복선언 할 수 잇다.
 * 
 * 단, 조건이 있는데
 * 	매개변수가 달라야 한다.
 * 매개변수의 type, 개수, 순서가 다르면 같은 이름의 method를 중복 선언 할 수 있다.
 */
public class NumberServiceV1 {

	protected Scanner scan;

	public NumberServiceV1() {
		scan = new Scanner(System.in);
	}
	
	public void addNum() {
		System.out.println("=".repeat(50));
		System.out.println("두 정수를 입력받아 합을 계산하는 프로그램입니다.");
		System.out.println("정수를 입력해주세요.");
		System.out.println("-".repeat(50));
		Integer num1 = this.inputNum("정수 1");
		if(num1 == null) {
			return;
		}
		Integer num2 = this.inputNum("정수 2");
		if(num2 == null) {
			return;
		}
		
		Integer retNum = this.addNum(num1, num2);
		if( retNum != null) {
			System.out.printf("두 정수 %d, %d 합은 %d 입니다.", num1, num2, retNum);
		} else {
			System.out.printf("두 정수 %d, %d 합은 짝수가 아닙니다.", num1, num2);
		}
		
	}
	
	private Integer inputNum(String str1) {
		while(true) {
			int intNum = 0;
			System.out.printf("(종료는 QUIT)\n %s >> ", str1);
			String strNum = scan.nextLine();
			if(strNum.equals("QUIT")) {
				return null;
			} 
			try {
				intNum = Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println("\t* 정수를 입력해주세요.");
				continue;
			}
			
//			if(intNum < 0 ) { }
			
			return intNum;	
		}
	}
	/*
	 * method 이름은 addNum()
	 * 두 개의 정수를 매개변수로 받는다
	 * 	누구나 어디선가 addNum() 호출할때는		객체.addNum()
	 * 	2개의 정수를 전달하게 하겠다			객체.addNum(100,200)
	 * 두 개의 정수를 전달받기 위해서는 method가 준비를 해야한다.
	 * 	method의 ( ) 안에 변수를 선언한다.
	 * 	두 개의 변수를 선언하자
	 * 
	 * 두 수의 합을 계산하여
	 * 	결과가 짝수이면 그 합을 return
	 * 		return 합; 형식의 명령이 있어야 한다
	 * 	그렇지 않으면 null을 return
	 * 		return null; 형식의 명령이 있어야 한다
	 * 
	 * return 값 형식의 명령이 있으려면 void가 아닌 return type을 지정해 주어야 한다
	 * 
	 * 	단순히 정수만 return을 하는 경우는 int type으로 하면되는데
	 * 	여기에서는 어떤 조건에 따라 null값을 return해야 하는 경우도 있기 때문에
	 * 	int type이 아닌 Integer type으로 설정해야 한다
	 */

	public Integer addNum(int num1, int num2) {
		// TODO 두 정수의 합이 짝수인가 판별하는 method
		
		// 어떤 연산을 수행하고 연산결과에 따라 return 등을 수행해야 하는경우
		//	연산된 결과를 변수에 담아놓고 이후 코드를 진행하자
		int sum = num1 + num2;
		if (sum % 2 == 0) {
			return sum;
		}
		return null;

		// C언어와 같은 함수형 언어에서 함수를 끝내는 return 문은 한번만 쓰자라는 전통적인 패턴
//		Integer sum = null;
//		if((num1 + num2) % 2 == 0) {
//			sum = num1 + num2;
//		}
//		return sum;
		
	} // addNum(int num1, int num2) 끝나는 곳
	
	/*
	 * java의 method는 매개변수에 따라 호출하는 방식이 달라진다
	 * 
	 * 만약 addNum(정수, 정수) 방식으로 호출하려면
	 * 		addNum(int num1, int num2) 형식으로 method 선언 (long)
	 * 만약 addNum(실수, 실수) 방식으로 호출하려면
	 * 		addNum(float num1, float num2) 형식으로 method 선언 (double)
	 * 
	 * method를 호출할 때 전달하는 데이터의 type에 맞도록 method가 미리 만들어져 있어야 한다.
	 */
	public Float addNum(float num1, float num2) {
		// TODO 두 실수를 전달받아 짝수인가 판별하는 코드
		float sum = num1 + num2;
		if(sum % 2 == 0) {
			return sum;
		}
		// method 코드가 아직 작성되지 않았을 때 문법오류 방지 임시코드
		return null;
	}
	
	public Float addNum(int num1, float num2) {
		return null;
	}
	
	public Float addNum(float num1, int num2) {
		return null;
	}
	
}