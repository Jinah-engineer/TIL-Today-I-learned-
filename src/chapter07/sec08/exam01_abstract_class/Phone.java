package chapter07.sec08.exam01_abstract_class;

public abstract class Phone {
	 // field
	public String owner;
	
	// constructor -- 추상 클래스는 자식클래스를 가지고 객체 생성 후, 생성자를 통해 객체를 만든다. 따라서 반드시 생성자가 있어야 하는 것
	public Phone(String owner) {
		this.owner = owner;
	}	
	
	// method
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
