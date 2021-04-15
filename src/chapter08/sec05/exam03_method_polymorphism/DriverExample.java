package chapter08.sec05.exam03_method_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		
		// 객체 생성
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
