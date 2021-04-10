package chapter06.sec09.exam01_instance_member;

public class Car {
	// field
	String model;
	int speed;
	
	// constructor
	Car(String model) {
		this.model = model;
	}
	
	// method
	void setSpeed(int speed) {
		this.speed = speed; // Car 객체가 가지고 있는 인스턴스 필드인 speed라는 것을 알 수 있다.
	}
	
	void run() {
		for(int i = 0; i <=50; i+=10) {
			setSpeed(i);
			System.out.println(model + "가 달립니다. (시속 : " + speed + "km/h)");
		}
	}
}
