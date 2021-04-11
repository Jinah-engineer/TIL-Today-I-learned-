package chapter06.sec13.exam03_field_method.package2;

import chapter06.sec13.exam03_field_method.package1.A;

public class C {
	public C() {
		A a = new A(); // A 객체 생성
		a.field1 = 1;
//		a.field2 = 1; --> other package
//		a.field3 = 1; --> private
		
		a.method1();
//		a.method2(); --> other package
//		a.method3(); --> private
	}
}
