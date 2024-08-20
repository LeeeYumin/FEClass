package exa;

import java.util.Scanner;

public class ScannerExam {
	
	public static void main(String[] args) {
		
		//키보드로 부터 입력을 받는 기능을 가져오자
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("출력하실 값을 입력하세요 : ");
		
		//키보드로 부터 입력 
		String x = sc.next();
		
		System.out.println(x);		
	}
}
