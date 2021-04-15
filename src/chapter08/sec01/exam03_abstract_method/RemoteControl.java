package chapter08.sec01.exam03_abstract_method;

public interface RemoteControl {
	// field
	int MAX_VOLUME = 20;
	int MIN_VOLUME = 10; 
	
	// abstract method
	// (public abstract) methodName(parameter); 
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
