package chapter09.sec03.exam02_field_method_access;

public class A {
	// instance field and method
	int field1; // 
	void method1() {}
	
	
	// static field and method
	static int field2;
	static void method2() {}
	
	
	// instance member class
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	
	// static member class
	static class C {
		void method() {
//			field1 = 10; --> A객체가 있어야 field1이 사용될 수 있다
//			method1();
			
			field2 = 10; // A객체 없이도 사용 가능
			method2();
		}
	}
}
