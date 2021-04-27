package chapter13.sec02.exam02_generic_type;

public class Box<T> {
	private T t;
	
	public void set(T object) { // parameter에는 모든 자바 객체들이 저장될 수 있다.
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
