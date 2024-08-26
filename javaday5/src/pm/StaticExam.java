package pm;

class Counter {
	static int count = 0;
	Counter() {
		count++;
		System.out.println(count);
	}
	
	public static int getCount() {
		return count;
	}
}


public class StaticExam {

	public static void main(String[] args) {
		// 매서드 사용을 위해서는 객체를 생성하고 그 객체로 접근
			Counter c1 = new Counter();
			c1.getCount();
		// 매서드에 static 을 걸어 놓으면 객체 생성 없이도
		// 클래스명.매서드() 접근 할수 있데 된다. 
			Counter.getCount();
	}

}
