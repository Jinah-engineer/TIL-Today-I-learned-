package chapter06.sec07.exam03_constructor_overloading;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.company);
		System.out.println("car1.color : " + car1.company);
		System.out.println("car1.maxSpeed  : " + car1.company);
		
		
		
		Car car2 = new Car("자가용");
		
		Car car3 = new Car("자가용", "빨강");
		
		Car car4 = new Car("자가용", "빨강", 200);
		
	}
}
