package chapter13.sec02.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		// 구체적인 타입을 넣어주기
		Box<String> box = new Box<String>();
		
//		box.set(new Integer(10)); --> error / 무조건 String 객체만 가능
		box.set("hello");
		String greet = box.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(200); // auto boxing
		int value = box2.get(); // auto unboxing
		
		
	}
}
