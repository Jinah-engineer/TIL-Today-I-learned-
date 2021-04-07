package chapter06.sec07.exam04_other_constructor_call;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color);
		System.out.println("car1.maxSpeed  : " + car1.maxSpeed);
		
		
		
		Car car2 = new Car("자가용");
		
		Car car3 = new Car("자가용", "빨강");
		
		Car car4 = new Car("자가용", "빨강", 200);
		
	}
}
