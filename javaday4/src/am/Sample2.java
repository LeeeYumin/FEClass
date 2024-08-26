package am;

class Animal {
	//객체 변수
	String name; //객체변수 instance variable

	// 매서드 - 변수에 값을 넣는 행위/동작
	public void setName(String name) {
		this.name = name;
	}
}


public class Sample2 {

	public static void main(String[] args) {
		Animal cat = new Animal();//객체를 생성
		cat.setName("boby");      //객체로 매서드 호출
		System.out.println(cat.name);//객체로 이름 호출
		//Animal클래스로 cat객체를 생성한다. 
		Animal dog = new Animal();
		dog.setName("happy");
		System.out.println(dog.name);
		Animal horse = new Animal();
	}
}
