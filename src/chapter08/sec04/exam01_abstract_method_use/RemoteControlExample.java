package chapter08.sec04.exam01_abstract_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 실행 클래스
		
		// interface 변수 선언
		RemoteControl rc = null; // 참조 타입인 interface
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		
	}
}
