package chapter08.sec05.exam02_field_array;

public class Car {
	// field - interface type field 선언과 초기 구현 객체 대입
	// 배열 변수로 선언
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	 
	// interface에서 설명된 roll() 추상메소드 호출
	void run() {
		for (Tire tire : tires) {
			tire.roll();
		}
	}
}
