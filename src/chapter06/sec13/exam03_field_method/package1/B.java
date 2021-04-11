package chapter06.sec13.exam03_field_method.package1;

public class B {
	// constructor
	public B() {
		A a = new A(); // A 객체 생성
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; --> private
		
		a.method1();
		a.method2();
//		a.method3(); --> private
	}
}
