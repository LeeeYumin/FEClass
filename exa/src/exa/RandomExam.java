package exa;

import java.util.Random;
import java.util.Scanner;

public class RandomExam {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		//정수값 입력받기
		System.out.print("정수값 : ");
		int x = sc.nextInt();
		
		//그 정수값을 기준으로 +5 -5 의 범위로 난수 발생
		int y = (x-5) + rand.nextInt(x+5);
		
		System.out.println("입력 값의 +-5 범위의 난수를 생성했습니다.");
		System.out.println("값은 " + y + "입니다.");
	}
}
