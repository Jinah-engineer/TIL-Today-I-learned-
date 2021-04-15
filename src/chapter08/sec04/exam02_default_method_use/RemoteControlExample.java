package chapter08.sec04.exam02_default_method_use;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 실행 클래스
		
		// interface 변수 선언
		RemoteControl rc = null; // 참조 타입인 interface
		
		rc = new Television();
		rc.turnOn(); // abstract method 호출
		rc.setMute(true); // default method 호출 - television 객체가 대입되었기 때문에 가능한 것
		
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}
