package am;

import java.util.Random;
import java.util.Scanner;

public class Review2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 입력 받는 기능
		Random rand = new Random();          // 난수 발생 기능
		
		int target = rand.nextInt(100);      // 정답 생성
		//int attempts = 6;                  // 최대 시도 횟수를 for문에서 설정
		
		// 아래 두 줄은 맨 처음 한번만 출력하기 위해 for 문 밖에서 만든다. 
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("0부터 99사이의 숫자를 맞추세요");
		
		// for(;;) { 무한 for문은 사용을 지양하자...
		for (int i = 6 ; i > 0 ; i--) {
			
			System.out.println("남은 횟수 " + i + "회, 어떤 숫자일까?");
			int n = sc.nextInt();
			
			if (n < target) {
				System.out.println("더 큰 숫자입니다.");
			} else if (n > target) {
				System.out.println("더 작은 숫자입니다.");
			} else {
				System.out.println((7-i) + "회만에 맞추었습니다.");
				break;
			}
			
		}
	}
}
