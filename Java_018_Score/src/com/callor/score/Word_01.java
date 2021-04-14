package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Word_01 {

	public static void main(String[] arg) {
		String fileName = "src/com/callor/score/word.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		System.out.println("=".repeat(50));
		System.out.println("\t단어\t |\t뜻");
		System.out.println("-".repeat(50));
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			String read = new String();
			while( (read = buffer.readLine()) != null ) {
				String[] word = read.split(":");
				System.out.printf("%15s\t |    %s\n",word[0], word[1]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=".repeat(50));
		
	}

}
