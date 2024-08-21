package javaday3;

import java.util.Scanner;

public class Review1 {
	
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
		
			System.out.print("정수 a:");
			int a = sc.nextInt();
			
			System.out.print("정수 b:");
			int b = sc.nextInt();
			
			if (a < b) {
				int t = a; //t는 temporary 의미. 가상의 변수? 에 잠시 넣어둔다고 생각하기 
				a = b;
				b = t;
			}
			
			System.out.println("a>=b가 되도록 정렬했습니다.");
			System.out.println("변수 a는 " + a + "입니다.");
			System.out.println("변수 b는 " + b + "입니다.");
		}

}