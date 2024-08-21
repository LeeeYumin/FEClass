package javaday3;

import java.util.Scanner;

public class Forexam5 {

	// 오후 for문 퀴즈 3

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정숫값 : ");
		int n = sc.nextInt();

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("의 약수는 " + count + "입니다.");
	}
}
