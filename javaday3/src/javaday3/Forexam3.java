package javaday3;

import java.util.Scanner;

public class Forexam3 {

	// 오후 for문 퀴즈 1

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1부터 n까지의 합을 구합니다.n의 값:");
		int n = sc.nextInt();

		int sum = 0; // 전역변수 global variable

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}