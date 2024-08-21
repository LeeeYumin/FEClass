package javaday3;

import java.util.Scanner;

public class Whilequiz1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int again = 1;
		 
		while (again == 1) {
			System.out.print("정수 값:");
			int n = sc.nextInt();
			
			if (n > 0) {
				System.out.println("이 값은 양수입니다.");
			} else if (n < 0) {
				System.out.println("이 값은 음수입니다.");
			} else {
				System.out.println("이 값은 0입니다.");
			}
		
			System.out.println("다시 한번? 1-Yes/0-No");
			again = sc.nextInt();

		}
	}
}
