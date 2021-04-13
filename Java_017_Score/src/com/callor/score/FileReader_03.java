package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_03 {
	public static void main(String[] args) {
		String fileName = "src/com/callor/score/sample_score.txt";

		// 파일을 읽기 위해서 open하는 클래스
		// OS에서 파일을 읽을 수 있도록 허락해달라 요청하기
		FileReader fileReader = null;
		
		// FileReader가 open 해 놓은 파일에서
		// 데이터를 읽어서 buff라고 하는 임시 기억장소에 저장
		BufferedReader buffer = null;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
//			String result = buffer.readLine();//string형 리턴
			
			// 파일에 저장된 데이터의 라인수를 알수 없을때는?
			for(int i = 0; i < 30 ; i++) {
				String result = buffer.readLine();
				System.out.println("str");
			}
			/*
			 * bufferedReader.readLine() method를 실행하면 buffer에 저장된
			 * 
			 * 만약 readLine() method를 데이터 개수만큼 반복하면 데이터를 읽을 수 있다.
			 * 
			 * 하지만 이 방법은 데이터의 개수를 알아아야만 실행할 수 있다.
			 * 
			 * 데이터의 개수를 정확히 알 수 없을때는 어쩔 수 없이 무한반복 중
			 * 탈출구 고민, 마찬가지로 LeadLine() 탈출할 수 있는 방법
			 */
			
			while(true) {
				String str = buffer.readLine();
				if(str == null) {
					break;
				}
			}
			
//			System.out.println(result);
//			result = buffer.readLine();
//			System.out.println(result);
//			result = buffer.readLine();
//			System.out.println(result);
			
			buffer.close();

		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
