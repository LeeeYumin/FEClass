package javaday2;

public class Intdoubleexam {

	public static void main(String[] args) {
		
		 int n1 = 123;
	        double d1 = n1;  // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
	        System.out.println("첫번째 : " + d1);  // 123.0 출력

	        double d2 = 123.456; // 명시적 형변환
	        int n2 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
	        System.out.println("두번째 : " + n2);  // 소숫점이 생략된 123 출력
	}
}
