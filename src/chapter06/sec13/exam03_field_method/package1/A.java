package chapter06.sec13.exam03_field_method.package1;

public class A {
	// field
	public int field1;
	int field2;
	private int field3;
	
	//constructor - 클래스 내부 필드, 메소드 호출
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	// method
	public void method1() {
		
	}
	void method2() {
		
	}
	
	private void method3() {
		
	}
}
