package chapter06.sec10.exam04_singleton;

public class Singleton {
	// static field declaration
	private static Singleton singleton = new Singleton();
	
	
	// static constructor
	private Singleton() {
		
	}
	
	// static method
	static Singleton getInstance() {
		return singleton;
	}
}
