package am;

public class Methodexam {

	int sum(int a, int b) { //매개변수
		return a+b;
	}
	
	public static void main(String[] args) {
		
		int a = 3;  
		int b = 4;  
		
		Methodexam sample = new Methodexam();
		int c = sample.sum(a, b); //인수
		
		System.out.println(c);
		
	}
	
	
	
}
