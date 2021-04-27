package chapter12.exam01_wrapper;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		// Boxing
		// wrapper class의 생성자 매개값으로 기본 타입 값 or 문자열을 줄 수 잇따
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = Integer.valueOf("100");

		// Unboxing
		int value1 = obj1.intValue();
		int value2 = obj1.intValue();
		int value3 = obj1.intValue();
		int value4 = obj1.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}
}