package am;

public class MyCalTest {

	public static void main(String[] args) {

		Calculator cal = new MyCal();
		
		cal.plus(3,4);
		cal.plus(5,6);
		
		int i = cal.exec(5, 6);
		System.out.println(i);
	}

}
