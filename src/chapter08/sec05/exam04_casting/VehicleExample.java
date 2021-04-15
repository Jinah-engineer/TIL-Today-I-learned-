package chapter08.sec05.exam04_casting;

public class VehicleExample {
	public static void main(String[] args) {
		// variable declaration
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare();
		
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		
	}
}
