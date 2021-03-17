package com.callor.values.var;

public class Varriable_01 {
	
	public static void main(String [] arg) {
		
		/*
		 * 1. 정수 30을 기억장치 어딘가에 보관
		 * 2. 정수 40을 기억장치 어딘가에 보관
		 * 3. 어딘가에 보관된 30을 CPU에 연산장치로 이동 (CPU의 controller가 하는일)
		 * 4. 어딘가에 보관된 40을 CPU에 연산장치로 이동
		 * 5. + 를 분석하여 두 숫자의 덧셈을 계산하라는 명령을 인식
		 * 6. 두 수를 덧셈장치(Adder)에 보내서 덧셈을 수행
		 * 7. 덧셈한 결과를 기억장치 어딘가에 보관
		 * 8. println() 에게 덧셈결과가 보관된 기억장소 위치(주소)를 알려준다
		 * 9. println() 덧셈결과가 보관된 기억장소를 찾아가서 보관된 값을 가져와서 System.out 한테 보낸다
		 * 10. System.out 은 운영체제(윈도우)에게 결과를 Console(cmd 창)에 출력해달라고 요청
		 * 11. 운영체제는 값을 Console에 출력하게 된다.
		 */
		System.out.print(" 30 + 40 = ");
		System.out.println( 30 + 40 );
		
		System.out.print(" 30 - 40 = ");
		System.out.println( 30 - 40 );
		
		System.out.print(" 30 x 40 = ");
		System.out.println( 30 * 40 );

		System.out.print(" 30 / 40 = ");
		System.out.println( 30 / 40 );

		System.out.print(" 30 % 40 = ");
		System.out.println( 30 % 40 );
		
		/*
		 * 위 5가지의 명령코드에서 숫자 30과 40, 연산결과는
		 * 기억장치 어딘가에 임시로 보관이 되어 연산 수행이 이루어진다
		 * 
		 * 그런데, 똑같은 30이라는 숫자가 5번 사용되었지만 이 30은 5개의 기억장소를 사용한다
		 * 또한 5번의 40도 5개의 기억장소를 사용하고, 결과를 저장하는 기억장소도 5개 사용한다
		 * 
		 * 불과 5번의 명령 수행을 위하여 기억장치를 15개 낭비하게 된다.
		 * 
		 * 30과 40이라는 두 숫자를 어떤 지정된 기억장소에 보관해 두고 
		 * 연산할때 그 값을 참조하여 연산을 하도록 한다면 기억장치를 효율적으로 사용할 수 있을것이다.
		 * 
		 * 이러한 개념을 발전 시킨것을 "변수(Varriable)"이라고 한다.
		 */
		
	}

}
