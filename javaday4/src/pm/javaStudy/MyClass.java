package pm.javaStudy;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// 인수도 없고 리턴도 없다. 
	public void method1() {
		System.out.println("m1이 실행됨...");
	} //
	
	// 인수는 있는데 리턴은 없다.
	public void method2(int x) {
		System.out.println(x + "을 이용한 m2 실행");
	} // create, update, delete

	
	// 인수는 없는데 리턴은 있다. 
	public int method3() {
		System.out.println("m3 실행");
		return 10;
	} // readlist
	
	// 인수도 있고 리턴도 있다. 
	public int method5(int y) {
		System.out.println(y + "이용한 m5 실행");
		return y*2;
	} // readdetail
}
