package chapter13.sec02.exam01_none_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		
		Box box = new Box();
		
		box.set("진마진마");
		
		Object obj = box.get();
		String obj2 = (String) box.get();
		
		box.set(new Apple()); // Object이 최상위 객체이기 때문에 Apple도 Object에 대입될 수 있다.
		Apple apple = (Apple) box.get();
	}
}
