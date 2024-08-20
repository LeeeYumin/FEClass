package javaday2;

public class Castingexam2 {
	
	public static void main(String[] args) {
		
		int n = 123;
		
		//숫자를 문자로 바꾸는 방법
        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n);
        
        System.out.println(num1);  // 123 출력
        System.out.println(num2);  // 123 출력
		
	}

}
