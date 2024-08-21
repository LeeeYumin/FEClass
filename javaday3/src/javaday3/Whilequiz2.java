package javaday3;

import java.util.Random;
import java.util.Scanner;

public class Whilequiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int answer = rand.nextInt(10+89);

		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요.");
		
		int x = 999999; //임의의 값을 정해줌
		
		while (answer != x) {
			System.out.print("어떤 숫자일까? : ");
			x = sc.nextInt();

			if (x > answer) {
				System.out.println("더 작은 숫자입니다.");
			}else if (x < answer) {
				System.out.println("더 큰 숫자입니다.");
			}
		}
		System.out.println("정답입니다.");
	}
}
