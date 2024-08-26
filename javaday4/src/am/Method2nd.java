package am;

public class Method2nd {

	public static void main(String[] args) {
		
		//객체 생성
		Method2nd method2nd = new Method2nd();
		
		//객체로 매서드 호출
		String result = method2nd.say();
		
		//결과 확인
		System.out.println(result);
	}
	
	//두번째 매서드 형 - 입력은 없고 리턴만 있는 매서드
	//웹 개발시 readlist 전체 목록 보기용 매서드로 사용
	
	String say() {
		return "Hi";
	}
	
	
}
