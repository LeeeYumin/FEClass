package am;

public class Method3rd {

	public static void main(String[] args) {
		
		//객체 생성
		Method3rd method3rd = new Method3rd();
		
		//객체로 매서드 호출
		method3rd.sum(3,4);
		
	}
	
	//세번째 매서드 형 - 입력은 있고 리턴이 없는 매서드
	//웹 개발시 create, update, delete 사용
	
	void sum(int a, int b) {
		System.out.println(a + "과" + b + "의 합은 " + (a+b) + "입니다.");
	}
	
	
}
