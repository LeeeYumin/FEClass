package am;

public class Method1st {

	public static void main(String[] args) {
		
		//객체 생성
		Method1st method1st = new Method1st();
		
		//객체로 매서드 호출
		int result = method1st.sum(3,4);
		
		//결과 확인
		System.out.println(result);
	}
	
	//첫번째 매서드 형 - 입력도 있고 리턴도 있는 매서드
	//가장 많이 사용되는 기본적인 형태의 매서드
	//웹 개발시 readdetail 몇 번 게시물 번호를 주면 그 게시물 자료를 가지고 나온다. 
	
	int sum(int a, int b) {
		return a+b;
	}
	
	
}
