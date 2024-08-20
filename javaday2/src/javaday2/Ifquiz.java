package javaday2;

import java.util.Scanner;

public class Ifquiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("당신의 나이를 입력하세요 :");
		int age = sc.nextInt();
		
		//괄호 안에 조건 ? true 일때 : false 일때
		String result = (age >= 18) ? "성인입니다" : "미성년자입니다";
		System.out.println(result);
	}
}