package chapter08.sec05.exam01_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		
	// 객체 생성
	Car myCar = new Car();

	myCar.run();
	
	System.out.println("-----------------------------");
	
	myCar.frontLeftTire = new KumhoTire();
	myCar.frontRightTire = new KumhoTire();
	
	myCar.run();
	
	}
}
