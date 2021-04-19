package chapter10.sec02_runtime_exception;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
	
		Dog dog = new Dog();
		changeDog(dog);
		
//		Cat cat = (Cat) animal; // ClassCastException
		Cat cat = new Cat();
		changeDog(cat);	
	}
	
	// method
	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		} else {
			System.out.println("Dog을 변환이 어렵습니다.");
		}
	}
}


class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}