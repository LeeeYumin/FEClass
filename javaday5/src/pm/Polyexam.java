package pm;

interface Predator {
	
}

class Animal {
	
}
class Tiger extends Animal implements Predator{
	
}
class Lion extends Animal implements Predator {
	
}
class Dog extends Animal implements Predator {
	
}
class Cat extends Animal implements Predator {
	
}
public class Polyexam {

	public static void main(String[] args) {

//		Tiger tiger = new Tiger();
//		Lion lion = new Lion();
//      Dog dog = new Dog();
//      Cat cat = new Cat();
        
//		Animal tiger = new Tiger();
//		Animal lion = new Lion();
//      Animal dog = new Dog();
//      Animal cat = new Cat();
		
		Predator tiger = new Tiger();
		Predator lion = new Lion();
		Predator dog = new Dog();
		Predator cat = new Cat();
        
		Predator[] arr = {tiger, lion, dog, cat};
        
	}

}
