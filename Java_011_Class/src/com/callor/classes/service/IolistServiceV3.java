package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV3 extends IolistServiceV1 {

	@Override
	public void input() {
		// TODO 매입매출 등록
		System.out.println("=".repeat(50));
		System.out.println("\t매입 매출 등록");
		System.out.println("-".repeat(50));
		System.out.print(" 상품명 (quit:입력중단) >> ");
		String pname = scan.next();
		if(pname == "quit" || pname == "QUIT") {
			return;
		}

		System.out.print(" 거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();

		System.out.print(" 거래처명 >> ");
		String dname = scan.next();

		System.out.print(" 매입매출 구분 >> ");
		String inout = scan.next();

		System.out.print(" 수량 >> ");
		Integer qty = this.inputPrice("수량");
		if(qty == null) {
			return;
		}
		
		System.out.print(" 매입단가 >> ");
		Integer iprice = this.inputPrice("매입단가");
		if(iprice == null) {
			return;
		}
		
		System.out.print(" 매출단가 >> ");
		Integer oprice = this.inputPrice("매출단가");
		if(oprice == null) {
			return;
		}
		
		IolistVO vo = new IolistVO();
		vo.setPname(pname);
		vo.setDate(date);
		vo.setDname(dname);
		vo.setQty(qty);
		vo.setIprice(iprice);
		vo.setOprice(oprice);
		iolist.add(vo);
	}
	
	private Integer inputPrice(String title) {
		while(true) {
			System.out.println(title + " 입력하세요. (입력 중단 : -1)");
			System.out.println(title + " 0 이상 입력하세요.");
			System.out.printf(" %s >> ", title);
			Integer num = scan.nextInt();
			if(num == -1) {
				return null;
			} else if(num < 0) {
				System.out.println(title + " 0 이상 입력하세요.");
			} else {
				return num;
			}
		}
	}

}
