package chapter07.sec08.exam02_abstract_method;

public class AnimalExample {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("----------------------");
		
		Animal animal = null;
		animal = new Dog(); // 자동타입변환
		animal.sound(); // 여전히 method overriding
		
		animal = new Cat();
		animal.sound();
		
		animalSound(new Dog());
		animalSound(new Cat());
		
	}
	
	public static void animalSound(Animal animal) { // 매개변수가 class type일 경우, 어떤 자식 객체도 여기 올 수 있음
		animal.sound();
	}
}
