package javaday3;

public class Forexam2 {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
		    for(int j=2; j<10; j++) {
		        System.out.print(j + "*" + i + "=" + (j*i) +"\t");
		    }
		    System.out.println("");  // 줄을 바꾸어 출력하는 역할을 한다.

		}		
	}
}