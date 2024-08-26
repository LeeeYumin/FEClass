package am;

public interface Calculator {

	// 원래 인터페이스의 의미인 명령서의 
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	//버전 8부터 실젝 동작하는 매서드로 만들수 있다.  
	default int exec(int i, int j) {
		return i+j;
	}
	
}
