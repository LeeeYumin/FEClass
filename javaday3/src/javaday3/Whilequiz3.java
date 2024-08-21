package javaday3;

import java.util.Scanner;

public class Whilequiz3 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 A:");
		int a = sc.nextInt();
		System.out.print("정수 B:");
		int b = sc.nextInt();

		if (a > b) {
			int t = a;// 지역변수 local variable
			a = b;
			b = t;
		}
		while (a <= b) {

			System.out.print(a + " ");
			a++; // a += 1, a = a + 1
		}
		
	}
}
