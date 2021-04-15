package chapter07.sec08.exam02_abstract_method;

public class Cat extends Animal{
	// constructor
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
