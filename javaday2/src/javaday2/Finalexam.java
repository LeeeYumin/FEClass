package javaday2;

import java.util.List;

public class Finalexam {
	
	public static void main(String[] args) {
		
		int a = 5;
		System.out.println(a);
		
		a = 6;
		System.out.println(a);
		
		final int b = 5;
		System.out.println(b);
		
		//b=6; b 에는 final 이 붙어있어서 한번 값을 넣어주면 바끌 수 없다
		
		
		final List<String> v = List.of("a", "b");
        v.add("c");  // UnsupportedOperationException 발생
		
	}

}
