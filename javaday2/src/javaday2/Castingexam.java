package javaday2;

public class Castingexam {
	
	public static void main(String[] args) {
		
		//문자를 숫자로 바꾸는 방법
		String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);  // 123 출력
        
        //숫자를 문자로 바꾸는 방법
        int n2 = 123;
        String num2 = "" + n2;
        System.out.println(num2);  // 123 출력
        
        
	}

}
