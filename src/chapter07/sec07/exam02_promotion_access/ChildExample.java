package chapter07.sec07.exam02_promotion_access;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // 자동타입변환
		
		parent.method1(); // method 호출
		parent.method2();
//		parent.method3(); --> compile error
	}
}
