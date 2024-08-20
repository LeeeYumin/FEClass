package javaday2;

import java.util.HashMap;

public class Hashmapexam {

	public static void main(String[] args) {
		
		// 앱 객체 생성
		HashMap<String, String> map = new HashMap<>();
		
		// 앱 객체에 데이터 넣기
		map.put("people", "사람");
		map.put("baseball", "야구");
		
		// 출력
		System.out.println(map.get("people")); // "사람" 출력
		}
}
