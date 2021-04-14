package com.callor.score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Student_01 {

	public static void main(String[] args) {

		String fileName = "src/com/callor/score/student.txt";

		FileReader fileReader = null;
		BufferedReader buffer = null;

		System.out.println("=".repeat(50));
		System.out.println(" 이름\t|\t주소");
		System.out.println("-".repeat(50));
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String read = buffer.readLine();
				if (read == null) {
					break;
				}

				String[] info = read.split(":");
				System.out.printf("%s\t| %s\n", info[1], info[5]);

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
