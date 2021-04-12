package com.callor.app.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriterEx_01 {
	
	protected String fileName;
	protected FileWriter fileWriter;
	protected PrintWriter out;
	protected Random rnd;
	
	public FileWriterEx_01() {
		fileName = "src/com/callor/app/service/data.txt";
		fileWriter = null;
		out = null;
		rnd = new Random();
	}
	
	public void fileWrite() {
		int num1 = rnd.nextInt(100)+1;
		int num2 = rnd.nextInt(100)+1;
		
		try {
			fileWriter = new FileWriter(fileName);
			out = new PrintWriter(fileName);
			
			out.println("=".repeat(40));
			out.println(this.cal(num1,num2,"+"));
			out.println(this.cal(num1,num2,"-"));
			out.println(this.cal(num1,num2,"*"));
			out.println(this.cal(num1,num2,"/"));
			out.println("-".repeat(40));
			out.flush();
			out.close();
			System.out.println("출력완료");
		} catch (IOException e) {
			System.out.println("출력 실패");
		}
	}
	
	public String cal(int num1, int num2, String a) {
		String retStr = null;
		if(a.equals("+")) {
			retStr = String.format("%d + %d = %d", num1, num2, num1+num2);
		} else if(a.equals("-")) {
			retStr = minus(num1,num2);
//			if( num1 < num2) {
//				int tmp = num1;
//				num1 = num2;
//				num2 = tmp;
//			}
//			retStr = String.format("%d - %d = %d", num1, num2, num1-num2);
		} else if(a.equals("*")) {
			retStr = String.format("%d x %d = %d", num1, num2, num1*num2);
		} else if(a.equals("/")) {
			retStr = mod(num1,num2);
//			if( num1 < num2) {
//				int tmp = num1;
//				num1 = num2;
//				num2 = tmp;
//			}
//			retStr = String.format("%d / %d = %d", num1, num2, num1/num2);
		}
		
		return retStr;
	}
	
	public String minus(int num1, int num2) {
		if(num1 < num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		return String.format("%d - %d = %d", num1, num2, num1-num2);
	}
	
	public String mod(int num1, int num2) {
		if(num1 < num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		return String.format("%d / %d = %d", num1, num2, num1/num2);
	}

}
