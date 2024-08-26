package pm;

class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	// 부모 클래스 Animal의 모든 게 보이지는 않지만 이미 왔있다. 
	void sleep() {
		System.out.println(this.name+" zzz");
	}
}

class HouseDog extends Dog {
	// Dog의 모든 기능과 Animal의 모든 기능을 전부 사용한다. 
	@Override
	void sleep() {
		System.out.println(this.name+" zzz in house");
	}
	
	void sleep(int hour) {
		System.out.println(this.name+" zzz in house" + hour + "Hours");
	}
}

public class Sample {

	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog();
		houseDog.setName("Happy"); //Animal 클래스의 기능
		houseDog.sleep();
		houseDog.sleep(3);//Dog 클래스의 가능
	}

}
