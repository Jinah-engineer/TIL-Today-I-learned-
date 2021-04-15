package chapter07.sec08.exam02_abstract_method;

public class Dog extends Animal{
	// constructor
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
