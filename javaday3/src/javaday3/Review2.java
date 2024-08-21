package javaday3;

import java.util.Random;

public class Review2 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
	int x = rand.nextInt(3);
		
		String result = (x==0) ? "가위" : (x==1) ? "바위" : "보";

		System.out.println("컴퓨터가 낸 것 : " + result);
	}
}