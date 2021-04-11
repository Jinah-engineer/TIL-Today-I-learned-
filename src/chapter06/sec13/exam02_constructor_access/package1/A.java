package chapter06.sec13.exam02_constructor_access.package1;

public class A {
	// field
	A a1 = new A(true);
	A a2 = new A();
	A a3 = new A("문자열"); // private - 자기 자신의 class 내에서는 사용 가능하다. 
	
	
	// constructor
	public A(boolean b) {
		
	}
	
	A() {
		
	}
	
	private A(String s) {
		
	}
}
