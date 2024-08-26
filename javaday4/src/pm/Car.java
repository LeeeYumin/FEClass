package pm;

public class Car {
	
	String name;
	int number;
	
	//생성자 1 클래스명과 동일하다. 리턴타입이 없고 리턴도 없다. 
	//생성자는 객체를 생성할떄 자동으로 실행되는 매서드의 일종
	public Car(String name) {
		this.name = name;
	}
	
	//디폴트 생성자. 
	//디폴트 생성자는 생성자를 만들지 않으면 자동으로 생성된다. 
	public Car() {
		
	}

	public void run() {
		System.out.println("차가 달립니다.");
	}
	
	public void run(int x) {
		System.out.println("차가 " + x + "km로 달립니다.");
	}
}
