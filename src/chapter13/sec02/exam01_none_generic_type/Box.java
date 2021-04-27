package chapter13.sec02.exam01_none_generic_type;

public class Box {
	private Object object;
	
	public void set(Object object) { // parameter에는 모든 자바 객체들이 저장될 수 있다.
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}
