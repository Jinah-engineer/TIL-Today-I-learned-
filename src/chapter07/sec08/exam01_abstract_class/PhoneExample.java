package chapter07.sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		
//		Phone phone = new Phone(); --> 불가
		
		// 실체클래스 - 자식클래스 (SmartPhone) 
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
