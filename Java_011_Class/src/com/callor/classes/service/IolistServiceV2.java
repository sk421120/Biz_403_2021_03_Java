package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV2 extends IolistServiceV1{

	/*
	 * V1의 input method를 재 정의한다
	 * 매입단가, 매출단가는 반드시 0이상이어야한다
	 * 유효성검사를 하도록 코드를 재 정의 한다
	 */
	@Override
	public void input() {
		// TODO 매입매출 등록
		System.out.println("=".repeat(50));
		System.out.println("\t매입 매출 등록");
		System.out.println("-".repeat(50));
		System.out.print(" 상품명 >> ");
		String pname = scan.next();

		System.out.print(" 거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();

		System.out.print(" 거래처명 >> ");
		String dname = scan.next();

		System.out.print(" 매입매출 구분 >> ");
		String inout = scan.next();

		// 0 이상만 입력한다
		
		//System.out.print(" 수량 >> ");
		Integer qty = this.input("수량");

		//System.out.print(" 매입단가 >> ");
		Integer iprice = this.input("매입단가");

		//System.out.print(" 매출단가 >> ");
		Integer oprice = this.input("매출단가");

		IolistVO iolistVO = new IolistVO();
		iolistVO.setPname(pname);
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInOut(inout);
		iolistVO.setQty(qty);
		iolistVO.setIprice(iprice);
		iolistVO.setOprice(oprice);

		// iolistVO에 저장한 데이터를 확인하기!!
		System.out.println("-".repeat(80));
		this.printIolist(iolistVO);
		
		iolist.add(iolistVO);
	}
	
	public Integer input(String str) {
		// 0 이상만 입력
		// 0 이상이면 다음 항목 입력받도록 while() 문을 중단하고
		// 0 미만이면 계속해서 반복문 내에서 입력을 받도록
		Integer intNum = 0;
		while(true) {
			System.out.printf(" %s >> ", str);
			intNum = scan.nextInt();
			if(intNum < 0) {
				System.out.println(" 잘못된 " + str + "입니다.");
				System.out.println(" 0이상을 입력해주세요.");
				continue;
			}
			break;
		}
		return intNum;
	}

	
}
