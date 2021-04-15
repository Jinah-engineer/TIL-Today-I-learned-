package chapter07.sec07.exam05_method_polymorphism;

public class Driver {
	public void drive(Vehicle vehicle) { // 여기 매개변수에는 Vehicle을 상속받은 자식 객체들만 들어올 수 있다!
		vehicle.run(); // 자식객체의 run이 실행된다. 
	}
}
