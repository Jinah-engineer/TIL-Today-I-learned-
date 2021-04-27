package chapter13.sec04.exam01_generic_method;

public class Box<T> {
	private T t;
	
	public void set(T t) { // parameter에는 모든 자바 객체들이 저장될 수 있다.
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
