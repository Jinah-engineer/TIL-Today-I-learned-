package chapter09.sec03.exam01_member_class_access;

public class A {
	// instance member class
	class B {}
	
	// static member class
	static class C {}
	
	
	// instance field
	B field1 = new B();
	C field2 = new C();
	
	// instance method
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// static field
//	static B field3 = new B(); --> A라는 객체없이도 사용될 수 있어야 하는데, B 클래스는 A객체가 반드시 생성되어야 한다.
	static C field4 = new C(); // A객체 없이도 사용할 수 있다. static class이기 때문에
	
	// static method
	static void method2() {
//		B var1 = new B(); --> A라는 객체없이도 원체 호출이 가능함. B 객체는 A 객체의 생성이 먼저다.
		C var2 = new C();
	}
}
 