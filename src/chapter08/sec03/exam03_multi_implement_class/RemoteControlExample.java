package chapter08.sec03.exam03_multi_implement_class;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv; // smart~ 객체를 interface 변수에 대입
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		Searchable searchable = tv; 
		searchable.search("http");
	}
}
