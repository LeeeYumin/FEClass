package javaday2;

import java.util.Scanner;

public class Switchexam2 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요 : ");
		int month = sc.nextInt();
		
        String monthString = "";
        switch (month) {  // 입력 변수의 자료형은 byte, short, char, int, enum, String만 가능하다.
            case 1:  case 2:  case 3:  case 4:
            	monthString = "겨울";
                break;
            case 5:  monthString = "봄";
                     break;
            case 6:  case 7: case 8: case 9:
            	monthString = "여름";
                     break;
            case 10: monthString = "가을";
            		break;
            case 11: case 12: 
            	monthString = "겨울";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
    }
}
