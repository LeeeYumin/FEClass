package am;

//public class Calculator {
/*	class Calculator1 {

	static int result = 0; // 계산을 위해 변수값을 0으로 초기화
	
	static int add(int num) { // 값을 계속 누적 시키는 매서드
		result += num;
		return result;
	}*/
	
	//예를 들어 취소하는 기능을 추가하면
	//static int cancel(int num ) {
		
	//}
//}
	
/*	class Calculator2 {

	static int result = 0; // 계산을 위해 변수값을 0으로 초기화
	
	static int add(int num) { // 값을 계속 누적 시키는 매서드
		result += num;
		return result;
	}
}*/
// 원래는 하나의 파일에 하나의 클래스만 만들어서 쓰는 것이 좋다. 
// 하지만 공부용으로는 하나의 파일에 여러 클래스를 만들 수도 있다. 
// 결론, 공부용으로만 사용하자 
// 단, 하나의 클래스에만 public 을 붙일 수 있다. 


class Calculator {

	 int result = 0; // 계산을 위해 변수값을 0으로 초기화
	
	 int add(int num) { // 값을 계속 누적 시키는 매서드
		result += num;
		return result;
	 }
}

public class Sample {
	public static void main(String[] args) {
		
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
	
		//1 계산대
		System.out.println(cal1.add(3));
		System.out.println(cal1.add(4));
		
		//2 계산대
		System.out.println(cal2.add(3));
		System.out.println(cal2.add(7));
	}
}

