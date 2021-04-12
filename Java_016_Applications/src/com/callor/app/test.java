package com.callor.app;

public class test {
	public static void main(String[] args) {
		System.out.println("=".repeat(15));
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print("  ");
				} else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
