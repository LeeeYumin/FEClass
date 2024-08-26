package am;

class Animal {
	String name; //객체 변수
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	
	Dog() {
		// 디폴트 생성자. 개발자가 디폴트 생성자를 만들지 않으면
		// 자동으로 디폴트 생성자가 만들어진다.그러나 하나라도 생성자를
		// 개발자가 만들면 디폴트 생성자는 만들어주지 않는다. 
	}
	
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDog extends Dog {
	
	//생성자 Constructor
	//1 생성자는 클래명과 동일하다. 
	//2 생성자는 리턴타입이 없다. 
	//생성자를 하나라도 만들면 디폴트 생성자를 만들어주지 않는다. 
	HouseDog(String name) {
		this.setName(name);
	}
	//객체를 생성할떄 문자가 들어오면 위의 생성자가 동작하고
	//           숫자가 들어오면 아래의 생성자가 동작한다. 
	//매서드 오버로딩과 동일하다. 
	HouseDog(int type) {
		if (type == 1) {
			this.setName("yorkshire");
		} else if (type == 2) {
			this.setName("bulldog");
		}
	}
	
	@Override
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	// method overloding 매서드 오버로딩  
	void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + "hours");
	}
}

public class constructorexam {

	public static void main(String[] args) {
		HouseDog dog = new HouseDog("Happy");// 객체 생성
		System.out.println(dog.name);
		HouseDog yorkshire = new HouseDog(1);
		System.out.println(yorkshire.name);
	}
}
