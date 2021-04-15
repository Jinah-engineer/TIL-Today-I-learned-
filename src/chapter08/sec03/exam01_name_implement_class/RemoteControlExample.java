package chapter08.sec03.exam01_name_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 실행 클래스
		
		// interface 변수 선언
		RemoteControl rc; 
		rc = new Television(); // 객체의 생성번지가 interface 변수의 값으로 저장된다. 인터페이스는 참조 타입
		rc = new Audio();
		
		// interface method 호출 - 마지막에 할당된 객체의 메소드가 실행된다(audio)
		rc.turnOn();
		rc.turnOff();
	}
}
