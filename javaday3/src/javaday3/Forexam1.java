package javaday3;

public class Forexam1 {

	public static void main(String[] args) {

		int[] marks = { 90, 25, 67, 45, 80 };
		
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= 90) {	
				System.out.println((i + 1) + "번 학생은 수입니다.");
			} else if (marks[i] >= 80){			
				System.out.println((i + 1) + "번 학생은 우입니다.");
			} else if (marks[i] >= 70) {
				System.out.println((i + 1) + "번 학생은 미입니다.");
			} else if (marks[i] >= 60) {
				System.out.println((i + 1) + "번 학생은 양입니다.");
			} else {
				System.out.println((i + 1) + "번 학생은 가입니다.");
			}
		}

	}
}
