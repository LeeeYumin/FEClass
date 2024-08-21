package javaday3;

import java.util.Scanner;

public class Forexam4 {

	// 오후 for문 퀴즈 2

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("몇 개의 *를 표시할까요?:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("*");
			if (i % 5 == 4) {
				System.out.println();
			}
		}

	}
}