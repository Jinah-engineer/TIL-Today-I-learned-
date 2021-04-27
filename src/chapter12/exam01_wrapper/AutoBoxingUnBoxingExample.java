package chapter12.exam01_wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// Auto Boxing
		Integer obj = 100; 
		System.out.println("value : "  + obj.intValue());
		
		// 대입 시 Auto Unboxing
		int value = obj;
		System.out.println("value : " + value); 
		
		// 연산 시 Auto Unboxing
		int result = obj + 100;
		System.out.println(result);
	}
}
