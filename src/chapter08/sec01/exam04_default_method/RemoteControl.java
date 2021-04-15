package chapter08.sec01.exam04_default_method;

public interface RemoteControl {
	// field
	int MAX_VOLUME = 20;
	int MIN_VOLUME = 10; 
	
	// abstract method
	// (public abstract) methodName(parameter); 
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}
