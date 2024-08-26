package pm;

public class Methodoverloding {

	public static void main(String[] args) {

	}
// 매서드 오버로딩은 형과 개수로 구분한다. 
	public int plus(int x, int y) {
		return x+y;
	}
	
//	public int plus(int i, int j) {
//		return i+j;
//	}
	// 갯수는 같아도 형이 다른 경우 문제 없다. 
	public String plus(String x, String y) {
		return x + y;
	}
	
	public int plue(int x, int y, int z) {
		return x+y+z;
	}
}









