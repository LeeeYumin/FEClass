package am;

public class CarExam2 {

	public static void main(String[] args) {

		Car c1 = new Car(); 
		Car c2 = new Car("소방차"); 
		Car c3 = new Car("구급차"); 
		
		// 디폴트 생성자가 자동으로 만들어져있다.
		// 하지만 생성자를 하나라도 만들면 디플트 생성자를 만들어 주지 않는다. 
		// 궂이 디폴트 생성자도 사용하고 싶다면 직접 디폴트 생성자를 만들면
		// 생성자 오버로딩이 동작하여 모두 사용할수 있게 된다. 
		System.out.println(c2.name);
	}

}
