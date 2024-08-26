package pm.javaStudy;

public class CarExam {

	public static void main(String[] args) {
		
		//클래스로 객체를 생성하고
		Car c1 = new Car();
		Car c2 = new Car();

		//생성한 객체로 변수에 넣고
		c1.name="소방차";
		c1.number=1234;
		
		c2.name="구급차";
		c2.number=1111;
		
		//객체로 변수값을 출력
		System.out.println(c1.name);
		System.out.println(c1.number);
		
		System.out.println(c2.name);
		System.out.println(c2.number);
		
	}
}
