package pm;

public class AccessObj {

	//어디서나 접근 가능
	public int p = 3;
	
	//같은 패키지 내에서만 접근 가능 상속 받은 경우는 접근 가능
	protected int p2 = 4;
	
	//같은 클래스 내에서만 접근 가능
	private int i = 1;
	
	
	//같은 패키지 네에서만 접근 가능
	int k = 2;
	
	// public > protected > default > private 
}
