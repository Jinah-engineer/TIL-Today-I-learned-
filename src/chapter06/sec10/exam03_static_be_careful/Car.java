package chapter06.sec10.exam03_static_be_careful;

public class Car {
	// field
	int speed; // instant field
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] arge) {
//		speed = 60; --> compile error (static method에서 instant field를 사용할 수 없다.)
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
